from msilib.schema import CheckBox
from PyQt5 import QtCore, QtGui, QtWidgets
import qdarkstyle
from PyQt5.QtGui import *
from PyQt5.QtWidgets import QMessageBox, QFileDialog
import webbrowser
import requests
import os.path
import os
from PySide2.QtCore import QThread, Signal
from PySide2.QtWidgets import QMainWindow, QApplication, QPushButton

class CustomThread(QThread):
    ended = Signal(bool)
    updateStatus = Signal(str)
    
    def __init__(self, Ui_Insaller):
        super().__init__()
 
    def run(self):
            url_download = "https://cdn.cloudflare.steamstatic.com/client/installer/SteamSetup.exe"
            download = requests.get(url_download)
            content = download.content
            file = open("SteamSetup.exe", "wb")
            file.write(content)
            file.close()

        #


class Ui_Installer(object):
    def __init__(self):
        super().__init__()

    def setupUi(self, Installer):
        Installer.setObjectName("Installer")
        Installer.setFixedSize(800, 516)
        icon = QtGui.QIcon()
        icon.addPixmap(QtGui.QPixmap("documents/icon.ico"), QtGui.QIcon.Normal, QtGui.QIcon.Off)
        Installer.setWindowIcon(icon)

        # Design
        self.centralwidget = QtWidgets.QWidget(Installer)
        self.centralwidget.setObjectName("centralwidget")
        self.toolButton = QtWidgets.QToolButton(self.centralwidget)
        self.toolButton.setGeometry(QtCore.QRect(650, 450, 121, 31))
        self.toolButton.setObjectName("toolButton")
        self.toolButton.clicked.connect(self.start_thread)
        self.toolButton_2 = QtWidgets.QToolButton(self.centralwidget)
        self.toolButton_2.clicked.connect(self.author)
        self.toolButton_2.setGeometry(QtCore.QRect(520, 450, 121, 31))
        self.toolButton_2.setObjectName("toolButton_2")
        self.toolButton_3 = QtWidgets.QToolButton(self.centralwidget)
        self.toolButton_3.setGeometry(QtCore.QRect(20, 450, 121, 31))
        self.toolButton_3.clicked.connect(self.setPath)
        self.toolButton_3.setObjectName("toolButton_3")
        self.label_37 = QtWidgets.QLabel(self.centralwidget)
        self.label_37.setGeometry(QtCore.QRect(300, 450, 221, 31))
        self.label_37.setText("Path not set!")
        self.pushButton = QtWidgets.QPushButton(self.centralwidget)
        self.pushButton.clicked.connect(self.dark_mode)
        self.pushButton.setGeometry(QtCore.QRect(160, 450, 121, 30))
        self.pushButton.setObjectName("pushButton")
        self.groupBox_2 = QtWidgets.QGroupBox(self.centralwidget)
        self.groupBox_2.setGeometry(QtCore.QRect(280, 30, 231, 391))
        self.groupBox_2.setObjectName("groupBox_2")
        self.label_10 = QtWidgets.QLabel(self.groupBox_2)
        self.label_10.setGeometry(QtCore.QRect(20, 30, 25, 25))
        self.label_10.setText("")
        self.label_10.setPixmap(QtGui.QPixmap("documents/images/vis.png"))
        self.label_10.setObjectName("label_10")
        self.checkBox_12 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_12.setGeometry(QtCore.QRect(50, 180, 121, 41))
        self.checkBox_12.setObjectName("checkBox_12")
        self.checkBox_13 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_13.setGeometry(QtCore.QRect(50, 300, 121, 41))
        self.checkBox_13.setObjectName("checkBox_13")
        self.checkBox_10 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_10.setGeometry(QtCore.QRect(50, 340, 121, 41))
        self.checkBox_10.setObjectName("checkBox_10")
        self.checkBox_17 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_17.setGeometry(QtCore.QRect(50, 220, 121, 41))
        self.checkBox_17.setObjectName("checkBox_17")
        self.checkBox_11 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_11.setGeometry(QtCore.QRect(50, 20, 121, 41))
        self.checkBox_11.setObjectName("checkBox_11")
        self.checkBox_18 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_18.setGeometry(QtCore.QRect(50, 260, 121, 41))
        self.checkBox_18.setObjectName("checkBox_18")
        self.checkBox_16 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_16.setGeometry(QtCore.QRect(50, 60, 121, 41))
        self.checkBox_16.setObjectName("checkBox_16")
        self.checkBox_14 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_14.setGeometry(QtCore.QRect(50, 100, 121, 41))
        self.checkBox_14.setObjectName("checkBox_14")
        self.checkBox_15 = QtWidgets.QCheckBox(self.groupBox_2)
        self.checkBox_15.setGeometry(QtCore.QRect(50, 140, 121, 41))
        self.checkBox_15.setObjectName("checkBox_15")
        self.label_11 = QtWidgets.QLabel(self.groupBox_2)
        self.label_11.setGeometry(QtCore.QRect(20, 70, 25, 25))
        self.label_11.setText("")
        self.label_11.setPixmap(QtGui.QPixmap("documents/images/Untitled(3).png"))
        self.label_11.setObjectName("label_11")
        self.label_12 = QtWidgets.QLabel(self.groupBox_2)
        self.label_12.setGeometry(QtCore.QRect(20, 110, 25, 25))
        self.label_12.setText("")
        self.label_12.setPixmap(QtGui.QPixmap("documents/images/st.png"))
        self.label_12.setObjectName("label_12")
        self.label_13 = QtWidgets.QLabel(self.groupBox_2)
        self.label_13.setGeometry(QtCore.QRect(20, 150, 25, 25))
        self.label_13.setText("")
        self.label_13.setPixmap(QtGui.QPixmap("documents/images/Untitled(6).png"))
        self.label_13.setObjectName("label_13")
        self.label_14 = QtWidgets.QLabel(self.groupBox_2)
        self.label_14.setGeometry(QtCore.QRect(20, 190, 25, 25))
        self.label_14.setText("")
        self.label_14.setPixmap(QtGui.QPixmap("documents/images/blender.png"))
        self.label_14.setObjectName("label_14")
        self.label_15 = QtWidgets.QLabel(self.groupBox_2)
        self.label_15.setGeometry(QtCore.QRect(20, 230, 25, 25))
        self.label_15.setText("")
        self.label_15.setPixmap(QtGui.QPixmap("documents/images/eclipse.png"))
        self.label_15.setObjectName("label_15")
        self.label_16 = QtWidgets.QLabel(self.groupBox_2)
        self.label_16.setGeometry(QtCore.QRect(20, 270, 25, 25))
        self.label_16.setText("")
        self.label_16.setPixmap(QtGui.QPixmap("documents/images/devpp.png"))
        self.label_16.setObjectName("label_16")
        self.label_17 = QtWidgets.QLabel(self.groupBox_2)
        self.label_17.setGeometry(QtCore.QRect(20, 310, 25, 25))
        self.label_17.setText("")
        self.label_17.setPixmap(QtGui.QPixmap("documents/images/nodejs.png"))
        self.label_17.setObjectName("label_17")
        self.label_18 = QtWidgets.QLabel(self.groupBox_2)
        self.label_18.setGeometry(QtCore.QRect(20, 350, 25, 25))
        self.label_18.setText("")
        self.label_18.setPixmap(QtGui.QPixmap("documents/images/qtdsgn.png"))
        self.label_18.setObjectName("label_18")
        self.groupBox_3 = QtWidgets.QGroupBox(self.centralwidget)
        self.groupBox_3.setGeometry(QtCore.QRect(540, 30, 231, 391))
        self.groupBox_3.setObjectName("groupBox_3")
        self.label_24 = QtWidgets.QLabel(self.groupBox_3)
        self.label_24.setGeometry(QtCore.QRect(20, 230, 25, 25))
        self.label_24.setText("")
        self.label_24.setPixmap(QtGui.QPixmap("documents/images/virtualbox.png"))
        self.label_24.setObjectName("label_24")
        self.checkBox_24 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_24.setGeometry(QtCore.QRect(50, 140, 121, 41))
        self.checkBox_24.setObjectName("checkBox_24")
        self.checkBox_25 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_25.setGeometry(QtCore.QRect(50, 60, 121, 41))
        self.checkBox_25.setObjectName("checkBox_25")
        self.checkBox_26 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_26.setGeometry(QtCore.QRect(50, 220, 121, 41))
        self.checkBox_26.setObjectName("checkBox_26")
        self.checkBox_23 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_23.setGeometry(QtCore.QRect(50, 100, 121, 41))
        self.checkBox_23.setObjectName("checkBox_23")
        self.checkBox_27 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_27.setGeometry(QtCore.QRect(50, 260, 121, 41))
        self.checkBox_27.setObjectName("checkBox_27")
        self.checkBox_21 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_21.setGeometry(QtCore.QRect(50, 180, 121, 41))
        self.checkBox_21.setObjectName("checkBox_21")
        self.label_21 = QtWidgets.QLabel(self.groupBox_3)
        self.label_21.setGeometry(QtCore.QRect(20, 110, 25, 25))
        self.label_21.setText("")
        self.label_21.setPixmap(QtGui.QPixmap("documents/images/7zip.png"))
        self.label_21.setObjectName("label_21")
        self.label_20 = QtWidgets.QLabel(self.groupBox_3)
        self.label_20.setGeometry(QtCore.QRect(20, 70, 25, 25))
        self.label_20.setText("")
        self.label_20.setPixmap(QtGui.QPixmap("documents/images/winrar.png"))
        self.label_20.setObjectName("label_20")
        self.checkBox_20 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_20.setGeometry(QtCore.QRect(50, 20, 131, 41))
        self.checkBox_20.setObjectName("checkBox_20")
        self.label_25 = QtWidgets.QLabel(self.groupBox_3)
        self.label_25.setGeometry(QtCore.QRect(20, 270, 25, 25))
        self.label_25.setText("")
        self.label_25.setPixmap(QtGui.QPixmap("documents/images/spotify.png"))
        self.label_25.setObjectName("label_25")
        self.checkBox_22 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_22.setGeometry(QtCore.QRect(50, 300, 121, 41))
        self.checkBox_22.setObjectName("checkBox_22")
        self.label_26 = QtWidgets.QLabel(self.groupBox_3)
        self.label_26.setGeometry(QtCore.QRect(20, 310, 25, 25))
        self.label_26.setText("")
        self.label_26.setPixmap(QtGui.QPixmap("documents/images/vlc.png"))
        self.label_26.setObjectName("label_26")
        self.checkBox_19 = QtWidgets.QCheckBox(self.groupBox_3)
        self.checkBox_19.setGeometry(QtCore.QRect(50, 340, 141, 41))
        self.checkBox_19.setObjectName("checkBox_19")
        self.label_22 = QtWidgets.QLabel(self.groupBox_3)
        self.label_22.setGeometry(QtCore.QRect(20, 150, 25, 25))
        self.label_22.setFrameShadow(QtWidgets.QFrame.Sunken)
        self.label_22.setText("")
        self.label_22.setPixmap(QtGui.QPixmap("documents/images/obs_studio.png"))
        self.label_22.setObjectName("label_22")
        self.label_23 = QtWidgets.QLabel(self.groupBox_3)
        self.label_23.setGeometry(QtCore.QRect(20, 190, 25, 25))
        self.label_23.setText("")
        self.label_23.setPixmap(QtGui.QPixmap("documents/images/geforce.png"))
        self.label_23.setObjectName("label_23")
        self.label_27 = QtWidgets.QLabel(self.groupBox_3)
        self.label_27.setGeometry(QtCore.QRect(20, 350, 25, 25))
        self.label_27.setText("")
        self.label_27.setPixmap(QtGui.QPixmap("documents/images/adobe_.png"))
        self.label_27.setObjectName("label_27")
        self.label_19 = QtWidgets.QLabel(self.groupBox_3)
        self.label_19.setEnabled(True)
        self.label_19.setGeometry(QtCore.QRect(20, 30, 25, 25))
        self.label_19.setText("")
        self.label_19.setPixmap(QtGui.QPixmap("documents/images/radeon_software_.png"))
        self.label_19.setAlignment(QtCore.Qt.AlignCenter)
        self.label_19.setWordWrap(False)
        self.label_19.setObjectName("label_19")
        self.groupBox = QtWidgets.QGroupBox(self.centralwidget)
        self.groupBox.setGeometry(QtCore.QRect(20, 30, 231, 391))
        self.groupBox.setObjectName("groupBox")
        self.checkBox_4 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_4.setGeometry(QtCore.QRect(50, 140, 121, 41))
        self.checkBox_4.setObjectName("checkBox_4")
        self.label_8 = QtWidgets.QLabel(self.groupBox)
        self.label_8.setGeometry(QtCore.QRect(20, 310, 25, 25))
        self.label_8.setText("")
        self.label_8.setPixmap(QtGui.QPixmap("documents/images/origin.png"))
        self.label_8.setObjectName("label_8")
        self.checkBox_2 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_2.setGeometry(QtCore.QRect(50, 60, 121, 41))
        self.checkBox_2.setObjectName("checkBox_2")
        self.label_2 = QtWidgets.QLabel(self.groupBox)
        self.label_2.setGeometry(QtCore.QRect(20, 30, 25, 25))
        self.label_2.setText("")
        self.label_2.setPixmap(QtGui.QPixmap("documents/images/idk.png"))
        self.label_2.setObjectName("label_2")
        self.label_9 = QtWidgets.QLabel(self.groupBox)
        self.label_9.setGeometry(QtCore.QRect(20, 350, 25, 25))
        self.label_9.setText("")
        self.label_9.setPixmap(QtGui.QPixmap("documents/images/mc.png"))
        self.label_9.setObjectName("label_9")
        self.label_6 = QtWidgets.QLabel(self.groupBox)
        self.label_6.setGeometry(QtCore.QRect(20, 230, 25, 25))
        self.label_6.setText("")
        self.label_6.setPixmap(QtGui.QPixmap("documents/images/bt.png"))
        self.label_6.setObjectName("label_6")
        self.label_5 = QtWidgets.QLabel(self.groupBox)
        self.label_5.setGeometry(QtCore.QRect(20, 190, 25, 25))
        self.label_5.setText("")
        self.label_5.setPixmap(QtGui.QPixmap("documents/images/epic.png"))
        self.label_5.setObjectName("label_5")
        self.label_3 = QtWidgets.QLabel(self.groupBox)
        self.label_3.setGeometry(QtCore.QRect(20, 150, 25, 25))
        self.label_3.setText("")
        self.label_3.setPixmap(QtGui.QPixmap("documents/images/mc.png"))
        self.label_3.setObjectName("label_3")
        self.checkBox_5 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_5.setGeometry(QtCore.QRect(50, 180, 121, 41))
        self.checkBox_5.setObjectName("checkBox_5")
        self.label_4 = QtWidgets.QLabel(self.groupBox)
        self.label_4.setGeometry(QtCore.QRect(20, 70, 25, 25))
        self.label_4.setText("")
        self.label_4.setPixmap(QtGui.QPixmap("documents/images/Undd.png"))
        self.label_4.setObjectName("label_4")
        self.checkBox_6 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_6.setGeometry(QtCore.QRect(50, 220, 121, 41))
        self.checkBox_6.setObjectName("checkBox_6")
        self.checkBox_7 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_7.setGeometry(QtCore.QRect(50, 260, 121, 41))
        self.checkBox_7.setObjectName("checkBox_7")
        self.checkBox_8 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_8.setGeometry(QtCore.QRect(50, 300, 121, 41))
        self.checkBox_8.setObjectName("checkBox_8")
        self.checkBox_3 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_3.setGeometry(QtCore.QRect(50, 100, 121, 41))
        self.checkBox_3.setObjectName("checkBox_3")
        self.label = QtWidgets.QLabel(self.groupBox)
        self.label.setGeometry(QtCore.QRect(20, 110, 25, 25))
        self.label.setText("")
        self.label.setPixmap(QtGui.QPixmap("documents/images/Untitled(2).png"))
        self.label.setObjectName("label")
        self.checkBox = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox.setGeometry(QtCore.QRect(50, 20, 121, 41))
        self.checkBox.setObjectName("checkBox")
        self.checkBox_9 = QtWidgets.QCheckBox(self.groupBox)
        self.checkBox_9.setGeometry(QtCore.QRect(50, 340, 121, 41))
        self.checkBox_9.setObjectName("checkBox_9")
        self.label_7 = QtWidgets.QLabel(self.groupBox)
        self.label_7.setGeometry(QtCore.QRect(20, 270, 25, 25))
        self.label_7.setText("")
        self.label_7.setPixmap(QtGui.QPixmap("documents/images/lgpng.png"))
        self.label_7.setObjectName("label_7")
        self.label_28 = QtWidgets.QLabel(self.groupBox)
        self.label_28.setGeometry(QtCore.QRect(290, 150, 25, 25))
        self.label_28.setText("")
        self.label_28.setPixmap(QtGui.QPixmap("documents/images/mc.png"))
        self.label_28.setObjectName("label_28")
        self.label_29 = QtWidgets.QLabel(self.groupBox)
        self.label_29.setGeometry(QtCore.QRect(290, 190, 25, 25))
        self.label_29.setText("")
        self.label_29.setPixmap(QtGui.QPixmap("documents/images/epic.png"))
        self.label_29.setObjectName("label_29")
        self.label_30 = QtWidgets.QLabel(self.groupBox)
        self.label_30.setGeometry(QtCore.QRect(290, 230, 25, 25))
        self.label_30.setText("")
        self.label_30.setPixmap(QtGui.QPixmap("documents/images/bt.png"))
        self.label_30.setObjectName("label_30")
        self.label_31 = QtWidgets.QLabel(self.groupBox)
        self.label_31.setGeometry(QtCore.QRect(290, 270, 25, 25))
        self.label_31.setText("")
        self.label_31.setPixmap(QtGui.QPixmap("documents/images/lgpng.png"))
        self.label_31.setObjectName("label_31")
        self.label_32 = QtWidgets.QLabel(self.groupBox)
        self.label_32.setGeometry(QtCore.QRect(290, 350, 25, 25))
        self.label_32.setText("")
        self.label_32.setPixmap(QtGui.QPixmap("documents/images/mc.png"))
        self.label_32.setObjectName("label_32")
        self.label_33 = QtWidgets.QLabel(self.groupBox)
        self.label_33.setGeometry(QtCore.QRect(290, 110, 25, 25))
        self.label_33.setText("")
        self.label_33.setPixmap(QtGui.QPixmap("documents/images/Untitled(2).png"))
        self.label_33.setObjectName("label_33")
        self.label_34 = QtWidgets.QLabel(self.groupBox)
        self.label_34.setGeometry(QtCore.QRect(290, 70, 25, 25))
        self.label_34.setText("")
        self.label_34.setPixmap(QtGui.QPixmap("documents/images/Undd.png"))
        self.label_34.setObjectName("label_34")
        self.label_35 = QtWidgets.QLabel(self.groupBox)
        self.label_35.setGeometry(QtCore.QRect(290, 310, 25, 25))
        self.label_35.setText("")
        self.label_35.setPixmap(QtGui.QPixmap("documents/images/origin.png"))
        self.label_35.setObjectName("label_35")
        self.label_36 = QtWidgets.QLabel(self.groupBox)
        self.label_36.setGeometry(QtCore.QRect(290, 30, 25, 25))
        self.label_36.setText("")
        self.label_36.setPixmap(QtGui.QPixmap("documents/images/idk.png"))
        self.label_36.setObjectName("label_36")
        Installer.setCentralWidget(self.centralwidget)
        self.statusbar = QtWidgets.QStatusBar(Installer)
        self.statusbar.setObjectName("statusbar")
        Installer.setStatusBar(self.statusbar)

        self.retranslateUi(Installer)
        QtCore.QMetaObject.connectSlotsByName(Installer)

    def retranslateUi(self, Installer):
        _translate = QtCore.QCoreApplication.translate
        Installer.setWindowTitle(_translate("Installer", "Multiple Installer"))
        self.toolButton.setText(_translate("Installer", "Install"))
        self.toolButton_2.setText(_translate("Installer", "Author"))
        self.toolButton_3.setText(_translate("Installer", "Choose Path"))
        self.pushButton.setText(_translate("Installer", "Dark Mode"))
        self.groupBox_2.setTitle(_translate("Installer", "Developing"))
        self.checkBox_12.setText(_translate("Installer", "Blender"))
        self.checkBox_13.setText(_translate("Installer", "NodeJS"))
        self.checkBox_10.setText(_translate("Installer", "QT Designer"))
        self.checkBox_17.setText(_translate("Installer", "Eclipse"))
        self.checkBox_11.setText(_translate("Installer", "Visual Studio 2022"))
        self.checkBox_18.setText(_translate("Installer", "Dev CPP"))
        self.checkBox_16.setText(_translate("Installer", "Visual Studio Code"))
        self.checkBox_14.setText(_translate("Installer", "Sublime Text"))
        self.checkBox_15.setText(_translate("Installer", "Pycharm"))
        self.groupBox_3.setTitle(_translate("Installer", "GroupBox"))
        self.checkBox_24.setText(_translate("Installer", "OBS"))
        self.checkBox_25.setText(_translate("Installer", "WinRar"))
        self.checkBox_26.setText(_translate("Installer", "VirtualBox"))
        self.checkBox_23.setText(_translate("Installer", "7-ZIP"))
        self.checkBox_27.setText(_translate("Installer", "Spotify"))
        self.checkBox_21.setText(_translate("Installer", "Geforce"))
        self.checkBox_20.setText(_translate("Installer", "AMD Radeon Software"))
        self.checkBox_22.setText(_translate("Installer", "VLC"))
        self.checkBox_19.setText(_translate("Installer", "Adobe Full Installer (WIP)"))
        self.groupBox_3.setTitle(_translate("Installer", "Utilities"))
        self.groupBox.setTitle(_translate("Installer", "Games"))
        self.checkBox_4.setText(_translate("Installer", "Minecraft Premium"))
        self.checkBox_2.setText(_translate("Installer", "Discord"))
        self.checkBox_5.setText(_translate("Installer", "Epic Games"))
        self.checkBox_6.setText(_translate("Installer", "Battle.net"))
        self.checkBox_7.setText(_translate("Installer", "Logitech G HUB"))
        self.checkBox_8.setText(_translate("Installer", "Origin"))
        self.checkBox_3.setText(_translate("Installer", "uTorrent"))
        self.checkBox.setText(_translate("Installer", "Steam"))
        self.checkBox_9.setText(_translate("Installer", "Minecraft (cracked)"))


    def start_thread(self):
        global y
        self.customThread = CustomThread()
        self.customThread.start()
        msg = QMessageBox()
        msg.setText("Downloading..")
        y = msg.exec_()

    
    def dark_mode(self):
        Installer.setStyleSheet(qdarkstyle.load_stylesheet_pyside2())

    def setPath(self):
        global path
        path = str(QtWidgets.QFileDialog.getExistingDirectory())
        if path != ('', ''):
            self.label_37.setText(path)
            self.label_37.setStyleSheet("color: green; font-weight: 700;")
        else:
            self.label_37.setText("Select a focking path")



    def signal_callback(self):
        self.button.setEnabled(True)
        self.statusBar().showMessage("Finished")


    def author(self):
        msg = QMessageBox()
        msg.setWindowTitle("Authors")
        msg.setText("Programmato da:\n- Giovanni Sansonetti (Code) \n- Gabriele Mancini (Design)")
        x = msg.exec_()
        time.sleep(0.5)
        webbrowser.open("https://github.com/darksnakepy/Design-QT")    

    




if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    Installer = QtWidgets.QMainWindow()
    ui = Ui_Installer()
    ui.setupUi(Installer)
    Installer.show()
    sys.exit(app.exec_())
