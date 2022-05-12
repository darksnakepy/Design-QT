from PySide2.QtCore import QThread, Signal
from PySide2.QtWidgets import QMainWindow, QApplication, QPushButton
import requests


class CustomThread(QThread):
    ended = Signal(bool)
    updateStatus = Signal(str)
 
    def __init__(self):
        super().__init__()
 
    def run(self):
        url_download = "https://download.jetbrains.com/python/pycharm-community-2021.3.3.exe?_ga=2.185222057.1085385846.1649606918-1947123728.1649606918&_gl=1*ifgtn3*_ga*MTk0NzEyMzcyOC4xNjQ5NjA2OTE4*_ga_V0XZL7QHEB*MTY0OTY5MDcwOS4yLjEuMTY0OTY5MDcxMi4w"
        download = requests.get(url_download)
        content = download.content
        file = open("PyCharm-Community.exe", "wb")
        file.write(content)
        file.close()

            
        self.ended.emit(False) # send signal to main thread
 
 
class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.customThread: Optional[CustomThread] = None
        self.button = QPushButton(text='Press me', parent=self)
        self.button.clicked.connect(self.start_thread)
 
    def start_thread(self):
        self.customThread = CustomThread()
        self.customThread.ended.connect(self.signal_callback)
        self.customThread.start()
        self.button.setEnabled(False)
        self.statusBar().showMessage('Downloading')
 
    def signal_callback(self):
        # this function will run after you call self.ended inside thread
        self.button.setEnabled(True)
        self.statusBar().showMessage('Finished task')
 
app = QApplication()
window = MainWindow()
window.show()
app.exec_()
