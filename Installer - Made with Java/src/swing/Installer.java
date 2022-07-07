package swing;

import java.lang.Thread;
import java.util.Date;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.io.File;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import javax.swing.JProgressBar;

public class Installer {
	
	JCheckBox chckbxSteam = new JCheckBox("Steam");
	JCheckBox chckbxDiscord = new JCheckBox("Discord");
	JCheckBox chckbxUtorrent = new JCheckBox("uTorrent");
	JCheckBox chckbxMinecraftPremium = new JCheckBox("Minecraft Premium");
	JCheckBox chckbxEpicGames = new JCheckBox("Epic Games");
	JCheckBox chckbxBattlenet = new JCheckBox("Battle.net");
	JCheckBox chckbxLogitechGHub = new JCheckBox("Logitech G HUB");
	JCheckBox chckbxOrigin = new JCheckBox("Origin");
	JCheckBox chckbxMinecraftcracked = new JCheckBox("Minecraft (cracked)");
	JCheckBox amd = new JCheckBox("AMD Radeon Software");
	JCheckBox winrar = new JCheckBox("WinRar");
	JCheckBox zip = new JCheckBox("7-ZIP");
	JCheckBox obs = new JCheckBox("OBS");
	JCheckBox geforce = new JCheckBox("Geforce");
	JCheckBox virtualbox = new JCheckBox("VirtualBox");
	JCheckBox spotify = new JCheckBox("Spotify");
	JCheckBox vlc = new JCheckBox("VLC");
	JCheckBox adobe = new JCheckBox("Adobe Full Installer (not working)");
	JCheckBox vs = new JCheckBox("Visual Studio 2022");
	JCheckBox vsc = new JCheckBox("Visual Studio Code");
	JCheckBox sublimeText = new JCheckBox("Sublime Text");
	JCheckBox pycharm = new JCheckBox("PyCharm");
	JCheckBox blender = new JCheckBox("Blender");
	JCheckBox eclipse = new JCheckBox("Eclipse Java Developer");
	JCheckBox dev = new JCheckBox("Dev CPP");
	JCheckBox nodejs = new JCheckBox("NodeJS");
	JCheckBox qtdesigner = new JCheckBox("QT Designer");
	JLabel lblNewLabel_1_1 = new JLabel("Developing");
	JButton btnNewButton_1 = new JButton();
	JButton btnNewButton_1_1 = new JButton("Select All");
	JLabel lblNewLabel = new JLabel();
	File p;
	String path;
	
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{		
	
		EventQueue.invokeLater(new Runnable() {		
		public void run() {
				try {
					Installer window = new Installer();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	public Installer() {
		initialize();
	}
	
	public void choosePath() {
		JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
        p = f.getSelectedFile();
        System.out.println(f.getSelectedFile());
        path = p.getAbsolutePath();
        chckbxSteam.setEnabled(true);
		chckbxDiscord.setEnabled(true);
		chckbxUtorrent.setEnabled(true);
		chckbxMinecraftPremium.setEnabled(true);
		chckbxEpicGames.setEnabled(true);
		chckbxBattlenet.setEnabled(true);
		chckbxLogitechGHub.setEnabled(true);
		chckbxOrigin.setEnabled(true);
		chckbxMinecraftcracked.setEnabled(false);
		amd.setEnabled(false);
		winrar.setEnabled(true);
		zip.setEnabled(true);
		obs.setEnabled(true);
		geforce.setEnabled(true);
		virtualbox.setEnabled(true);
		spotify.setEnabled(true);
		vlc.setEnabled(true);
		adobe.setEnabled(false);
		vs.setEnabled(true);
		vsc.setEnabled(true);
		sublimeText.setEnabled(true);
		pycharm.setEnabled(true);
		blender.setEnabled(true);
		eclipse.setEnabled(true);
		dev.setEnabled(true);
		nodejs.setEnabled(true);
		qtdesigner.setEnabled(true);
		btnNewButton_1.setEnabled(true);
		btnNewButton_1_1.setEnabled(true);
		 
	}
	
	public void initialize() {
		adobe.setEnabled(false);
		amd.setEnabled(false);
		chckbxMinecraftcracked.setEnabled(false);
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 516);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("gaming");
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(22, 21, 229, 387);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		chckbxSteam.setEnabled(false);
		chckbxDiscord.setEnabled(false);
		chckbxUtorrent.setEnabled(false);
		chckbxMinecraftPremium.setEnabled(false);
		chckbxEpicGames.setEnabled(false);
		chckbxBattlenet.setEnabled(false);
		chckbxLogitechGHub.setEnabled(false);
		chckbxOrigin.setEnabled(false);
		chckbxMinecraftcracked.setEnabled(false);
		amd.setEnabled(false);
		winrar.setEnabled(false);
		zip.setEnabled(false);
		obs.setEnabled(false);
		geforce.setEnabled(false);
		virtualbox.setEnabled(false);
		spotify.setEnabled(false);
		vlc.setEnabled(false);
		adobe.setEnabled(false);
		vs.setEnabled(false);
		vsc.setEnabled(false);
		sublimeText.setEnabled(false);
		pycharm.setEnabled(false);
		blender.setEnabled(false);
		eclipse.setEnabled(false);
		dev.setEnabled(false);
		nodejs.setEnabled(false);
		qtdesigner.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1_1.setEnabled(false);
		
		chckbxSteam.setBounds(25, 33, 97, 23);
		panel.add(chckbxSteam);
		
		
		chckbxDiscord.setBounds(25, 73, 97, 23);
		panel.add(chckbxDiscord);
		
		
		chckbxUtorrent.setBounds(25, 113, 97, 23);
		panel.add(chckbxUtorrent);
		
		
		chckbxMinecraftPremium.setBounds(25, 152, 198, 23);
		panel.add(chckbxMinecraftPremium);
		
		
		chckbxEpicGames.setBounds(25, 193, 97, 23);
		panel.add(chckbxEpicGames);
		
		
		chckbxBattlenet.setBounds(25, 236, 97, 23);
		panel.add(chckbxBattlenet);
		
		
		chckbxLogitechGHub.setBounds(25, 276, 130, 23);
		panel.add(chckbxLogitechGHub);
		
		
		chckbxOrigin.setBounds(25, 318, 97, 23);
		panel.add(chckbxOrigin);
		
		
		chckbxMinecraftcracked.setBounds(25, 357, 198, 23);
		panel.add(chckbxMinecraftcracked);
		
		JLabel lblNewLabel_1 = new JLabel("Games");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(499, 21, 229, 387);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		amd.setBounds(25, 32, 198, 23);
		panel_1.add(amd);
		
		
		winrar.setBounds(25, 73, 97, 23);
		panel_1.add(winrar);
		
		
		zip.setBounds(25, 113, 97, 23);
		panel_1.add(zip);
		
		
		obs.setBounds(25, 152, 97, 23);
		panel_1.add(obs);
		
		
		geforce.setBounds(25, 193, 97, 23);
		panel_1.add(geforce);
		
		
		virtualbox.setBounds(25, 236, 97, 23);
		panel_1.add(virtualbox);
		
		
		spotify.setBounds(25, 276, 97, 23);
		panel_1.add(spotify);
		
		
		vlc.setBounds(25, 318, 97, 23);
		panel_1.add(vlc);
		
		
		adobe.setBounds(25, 357, 198, 23);
		panel_1.add(adobe);
		
		JLabel lblNewLabel_1_2 = new JLabel("Utilities");
		lblNewLabel_1_2.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(261, 21, 229, 387);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		
		vs.setBounds(25, 32, 137, 23);
		panel_1_1.add(vs);
		
		
		vsc.setBounds(25, 73, 198, 23);
		panel_1_1.add(vsc);
		
		
		sublimeText.setBounds(25, 113, 198, 23);
		panel_1_1.add(sublimeText);
		
		
		pycharm.setBounds(25, 152, 97, 23);
		panel_1_1.add(pycharm);
		
		
		blender.setBounds(25, 193, 97, 23);
		panel_1_1.add(blender);
		
		
		eclipse.setBounds(25, 236, 198, 23);
		panel_1_1.add(eclipse);
		
		
		dev.setBounds(25, 276, 97, 23);
		panel_1_1.add(dev);
		
		
		nodejs.setBounds(25, 318, 97, 23);
		panel_1_1.add(nodejs);
		
		
		qtdesigner.setBounds(25, 357, 97, 23);
		panel_1_1.add(qtdesigner);
		
		
		lblNewLabel_1_1.setBounds(10, 11, 78, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Choose Path");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				choosePath();
			}

		});
		
		btnNewButton.setBounds(22, 435, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		btnNewButton_1.setText("Download");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent r) {
				
				if (chckbxSteam.isSelected()) {
					System.out.println(p);
					Thread steamThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Steam");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://cdn.cloudflare.steamstatic.com/client/installer/SteamSetup.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\SteamSetup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent); 
									     
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
						
					});
					
					steamThread.start();
				}
				
				if (chckbxDiscord.isSelected()) {
					Thread discordThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Discord");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://discord.com/api/downloads/distributions/app/installers/latest?channel=stable&platform=win&arch=x86").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Discord-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									        
									    }
									    
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					discordThread.start();
				}
				
				if (chckbxUtorrent.isSelected()) {
					Thread torrentThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("uTorrent");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download-hr.utorrent.com/track/stable/endpoint/utorrent/os/windows").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\uTorrent-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					torrentThread.start();
				}
				
				if (chckbxMinecraftPremium.isSelected()) {
					Thread mpThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Mp");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://launcher.mojang.com/download/MinecraftInstaller.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Minecraft-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					mpThread.start();
				}
				
				if (chckbxEpicGames.isSelected()) {
					Thread epicgamesThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Epic Games");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://launcher-public-service-prod06.ol.epicgames.com/launcher/api/installer/download/EpicGamesLauncherInstaller.msi").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Epic-Games-Setup.msi")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									        
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					epicgamesThread.start();
				}
				
				if (chckbxBattlenet.isSelected()) {
					Thread battlenetThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Battle.net");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://www.battle.net/download/getInstallerForGame?os=win&gameProgram=BATTLENET_APP&version=Live&id=548869183.1649688146").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\BattleNet-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					battlenetThread.start();
				}
				
				if (chckbxLogitechGHub.isSelected()) {
					Thread logitechThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Logitech");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download01.logi.com/web/ftp/pub/techsupport/gaming/lghub_installer.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Logitech-G-HUB.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					logitechThread.start();
				}
				
				if (chckbxOrigin.isSelected()) {
					Thread originThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Origin");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://www.dm.origin.com/download").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Origin-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					originThread.start();
				}
				
				if (chckbxMinecraftcracked.isSelected()) {
					System.out.println("MC");
					
				}
				
				if (vs.isSelected()) {
					Thread vsThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("vs");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://c2rsetup.officeapps.live.com/c2r/downloadVS.aspx?sku=community&channel=Release&version=VS2022&source=VSLandingPage&cid=2030").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\VisualStudio.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					vsThread.start();
				}
				
				if (vsc.isSelected()) {
					Thread vscThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("vsc");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://code.visualstudio.com/sha/download?build=stable&os=win32-x64-user").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\VisualStudioCode.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					vscThread.start();
				}
				
				if (sublimeText.isSelected()) {
					Thread sublimetxThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Sublime Text");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download.sublimetext.com/sublime_text_build_4126_x64_setup.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\SublimeText-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					sublimetxThread.start();
				}
				
				if (pycharm.isSelected()) {
					Thread pycharmThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("PyCharm");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download.jetbrains.com/python/pycharm-community-2021.3.3.exe?_ga=2.185222057.1085385846.1649606918-1947123728.1649606918&_gl=1*ifgtn3*_ga*MTk0NzEyMzcyOC4xNjQ5NjA2OTE4*_ga_V0XZL7QHEB*MTY0OTY5MDcwOS4yLjEuMTY0OTY5MDcxMi4w").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\PyCharm-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					pycharmThread.start();
				}
				
				if (blender.isSelected()) {
					Thread blenderThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Blender");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://ftp.nluug.nl/pub/graphics/blender/release/Blender3.1/blender-3.1.2-windows-x64.msi").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Blender-Setup.msi")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					blenderThread.start();
				}
				
				if (eclipse.isSelected()) {
					Thread eclipseThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Eclipse");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://ftp.acc.umu.se/mirror/eclipse.org/oomph/epp/2022-03/R/eclipse-inst-jre-win64.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Eclipse-IDE-Java.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					eclipseThread.start();
				}
				
				if (dev.isSelected()) {
					Thread devThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Dev");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://sourceforge.net/projects/orwelldevcpp/files/latest/download").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\DevCPP-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					devThread.start();
				}
				
				if (nodejs.isSelected()) {
					Thread nodejsThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("NodeJS");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://nodejs.org/dist/v16.14.2/node-v16.14.2-x64.msi").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\NodeJS-Setup.msi")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					nodejsThread.start();
				}
				
				if (qtdesigner.isSelected()) {
					Thread qtThread = new Thread(new Runnable() {
						public void run() {
						System.out.println("QT");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://d13lb3tujbc8s0.cloudfront.net/onlineinstallers/qt-unified-windows-x86-4.3.0-1-online.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\QT-Designer_Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					qtThread.start();
				}
				
				if (amd.isSelected()) {
					System.out.println("AMD");
				}
				
				if (winrar.isSelected()) {
					Thread winrarThread = new Thread(new Runnable() {
						public void run() {
						System.out.println("winrar");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://www.win-rar.com/fileadmin/winrar-versions/winrar/winrar-x64-611it.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\WinRar-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					winrarThread.start();
				}
				
				if (zip.isSelected()) {
					Thread szipThread = new Thread(new Runnable() {
						public void run() {
						    System.out.println("zip");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://www.7-zip.org/a/7z2107-x64.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\7z-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					szipThread.start();
				}
				
				if (obs.isSelected()) {
					Thread obsThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("OBS");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://cdn-fastly.obsproject.com/downloads/OBS-Studio-27.2.4-Full-Installer-x64.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\OBS-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					obsThread.start();
				}
				
				if (geforce.isSelected()) {
					Thread geforceThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Geforce");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://it.download.nvidia.com/GFE/GFEClient/3.25.1.27/GeForce_Experience_v3.25.1.27.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\Geforce-Experience.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					geforceThread.start();
				}
				
				if (virtualbox.isSelected()) {
					Thread virtualboxThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("VirualBox");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download.virtualbox.org/virtualbox/6.1.32/VirtualBox-6.1.32-149290-Win.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\VirtualBox-last-version.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					virtualboxThread.start();
				}
				
				if (spotify.isSelected()) {
					Thread spotifyThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("Spotify");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://download.scdn.co/SpotifySetup.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\SpotifySetup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					spotifyThread.start();
				}
				
				if (vlc.isSelected()) {
					Thread vlcThread = new Thread(new Runnable() {
						public void run() {
							System.out.println("VLC");
							try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://get.videolan.org/vlc/3.0.16/win64/vlc-3.0.16-win64.exe").openStream());
									  FileOutputStream fileOS = new FileOutputStream(p + "\\VLC-Setup.exe")) {
									    byte data[] = new byte[1024];
									    int byteContent;
									    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
									        fileOS.write(data, 0, byteContent);
									    }
									    System.out.println("Installed");
									} catch (IOException e) {
									    // handles IO exceptions
									}
						}
					});
					
					vlcThread.start();
				}
				
				if (adobe.isSelected()) {
					System.out.println("Adobe not work");
			
				}
				
				
				
			}
		});
		btnNewButton_1.setBounds(625, 435, 103, 23);
		
		frame.getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxSteam.setSelected(true);
				chckbxDiscord.setSelected(true);
				chckbxUtorrent.setSelected(true);
				chckbxMinecraftPremium.setSelected(true);
				chckbxEpicGames.setSelected(true);
				chckbxBattlenet.setSelected(true);
				chckbxLogitechGHub.setSelected(true);
				chckbxOrigin.setSelected(true);
				chckbxMinecraftcracked.setSelected(false);
				amd.setSelected(false);
				winrar.setSelected(true);
				zip.setSelected(true);
				obs.setSelected(true);
				geforce.setSelected(true);
				virtualbox.setSelected(true);
				spotify.setSelected(true);
				vlc.setSelected(true);
				adobe.setSelected(false);
				vs.setSelected(true);
				vsc.setSelected(true);
				sublimeText.setSelected(true);
				pycharm.setSelected(true);
				blender.setSelected(true);
				eclipse.setSelected(true);
				dev.setSelected(true);
				nodejs.setSelected(true);
				qtdesigner.setSelected(true);
			}
		});
		btnNewButton_1_1.setBounds(512, 435, 103, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		
		lblNewLabel.setBounds(218, 435, 94, 23);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
	

