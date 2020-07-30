import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class Game {


	Font font = new Font("arial", 1, 30);
	Font font2 = new Font("arial", 1, 20);
	Container con;
	int correct = 0;
	int count = -1;

	JTextPane kPane = new JTextPane();
	JTextPane hPane = new JTextPane();
	JTextPane textPane;
	JFrame frame;
	JPanel playButtonPanel, helpButtonPanel, quitButtonPanel, backPlayButtonPanel, backHelpButtonPanel,
	HiraganaButtonPanel, KatakanaButtonPanel, mainTextPanel, aHButtonPanel, iHButtonPanel, uHButtonPanel,
	eHButtonPanel, oHButtonPanel, kaHButtonPanel, kiHButtonPanel, kuHButtonPanel, keHButtonPanel, 
	koHButtonPanel, saHButtonPanel, siHButtonPanel, suHButtonPanel, seHButtonPanel, soHButtonPanel,
	taHButtonPanel, tiHButtonPanel, tuHButtonPanel, teHButtonPanel, toHButtonPanel, naHButtonPanel, 
	niHButtonPanel, nuHButtonPanel, neHButtonPanel, noHButtonPanel, haHButtonPanel, hiHButtonPanel, 
	huHButtonPanel, heHButtonPanel, hoHButtonPanel, maHButtonPanel, miHButtonPanel, muHButtonPanel,
	meHButtonPanel, moHButtonPanel, yaHButtonPanel, yuHButtonPanel, yoHButtonPanel, raHButtonPanel, 
	riHButtonPanel, ruHButtonPanel, reHButtonPanel, roHButtonPanel, waHButtonPanel, nHButtonPanel, 
	woHButtonPanel, 
	aKButtonPanel, iKButtonPanel, uKButtonPanel,
	eKButtonPanel, oKButtonPanel, kaKButtonPanel, kiKButtonPanel, kuKButtonPanel, keKButtonPanel, 
	koKButtonPanel, saKButtonPanel, siKButtonPanel, suKButtonPanel, seKButtonPanel, soKButtonPanel,
	taKButtonPanel, tiKButtonPanel, tuKButtonPanel, teKButtonPanel, toKButtonPanel, naKButtonPanel, 
	niKButtonPanel, nuKButtonPanel, neKButtonPanel, noKButtonPanel, haKButtonPanel, hiKButtonPanel, 
	huKButtonPanel, heKButtonPanel, hoKButtonPanel, maKButtonPanel, miKButtonPanel, muKButtonPanel,
	meKButtonPanel, moKButtonPanel, yaKButtonPanel, yuKButtonPanel, yoKButtonPanel, raKButtonPanel, 
	riKButtonPanel, ruKButtonPanel, reKButtonPanel, roKButtonPanel, waKButtonPanel, nKButtonPanel, 
	woKButtonPanel,
	chooseHButtonPanel, chooseKButtonPanel;
	JButton playButton, helpButton, quitButton, backPlayButton, backHelpButton, HiraganaButton, KatakanaButton,
	aHButton, iHButton, uHButton, eHButton, oHButton, kaHButton, kiHButton, kuHButton, keHButton, koHButton,
	saHButton, siHButton, suHButton, seHButton, soHButton, taHButton, tiHButton, tuHButton, teHButton, toHButton,
	naHButton, niHButton, nuHButton, neHButton, noHButton, haHButton, hiHButton, huHButton, heHButton, hoHButton,
	maHButton, miHButton, muHButton, meHButton, moHButton, yaHButton, yuHButton, yoHButton, raHButton, riHButton, 
	ruHButton, reHButton, roHButton, waHButton, nHButton, woHButton,
	aKButton, iKButton, uKButton, eKButton, oKButton, kaKButton, kiKButton, kuKButton, keKButton, koKButton,
	saKButton, siKButton, suKButton, seKButton, soKButton, taKButton, tiKButton, tuKButton, teKButton, toKButton,
	naKButton, niKButton, nuKButton, neKButton, noKButton, haKButton, hiKButton, huKButton, heKButton, hoKButton,
	maKButton, miKButton, muKButton, meKButton, moKButton, yaKButton, yuKButton, yoKButton, raKButton, riKButton, 
	ruKButton, reKButton, roKButton, waKButton, nKButton, woKButton,
	chooseHButton, chooseKButton;
	JLabel menuLabel, helpLabel, playLabel, correctLabel, countLabel;
	JTextArea mainTextArea;	// We will use JTextArea for a lot of text 

	ArrayList<String> storedChar = new ArrayList<>();


	ImageIcon iconMenu, iconHelp, iconPlay;

	PlayScreenHandler psHandler = new PlayScreenHandler();
	HelpScreenHandler hsHandler = new HelpScreenHandler();
	QuitScreenHandler qsHandler = new QuitScreenHandler();
	BackPlayScreenHandler bpsHandler = new BackPlayScreenHandler();
	BackHelpScreenHandler bhsHandler = new BackHelpScreenHandler();
	HCScreenHandler hcshandler = new HCScreenHandler();
	KCScreenHandler kcshandler = new KCScreenHandler();
	aHHandler ahHandler = new aHHandler();
	iHHandler ihHandler = new iHHandler();
	uHHandler uhHandler = new uHHandler();
	eHHandler ehHandler = new eHHandler();
	oHHandler ohHandler = new oHHandler();
	kaHHandler kahHandler = new kaHHandler();
	kiHHandler kihHandler = new kiHHandler();
	kuHHandler kuhHandler = new kuHHandler();
	keHHandler kehHandler = new keHHandler();
	koHHandler kohHandler = new koHHandler();
	saHHandler sahHandler = new saHHandler();
	siHHandler sihHandler = new siHHandler();
	suHHandler suhHandler = new suHHandler();
	seHHandler sehHandler = new seHHandler();
	soHHandler sohHandler = new soHHandler();
	taHHandler tahHandler = new taHHandler();
	tiHHandler tihHandler = new tiHHandler();
	tuHHandler tuhHandler = new tuHHandler();
	teHHandler tehHandler = new teHHandler();
	toHHandler tohHandler = new toHHandler();
	naHHandler nahHandler = new naHHandler();
	niHHandler nihHandler = new niHHandler();
	nuHHandler nuhHandler = new nuHHandler();
	neHHandler nehHandler = new neHHandler();
	noHHandler nohHandler = new noHHandler();
	haHHandler hahHandler = new haHHandler();
	hiHHandler hihHandler = new hiHHandler();
	huHHandler huhHandler = new huHHandler();
	heHHandler hehHandler = new heHHandler();
	hoHHandler hohHandler = new hoHHandler();
	maHHandler mahHandler = new maHHandler();
	miHHandler mihHandler = new miHHandler();
	muHHandler muhHandler = new muHHandler();
	meHHandler mehHandler = new meHHandler();
	moHHandler mohHandler = new moHHandler();
	yaHHandler yahHandler = new yaHHandler();
	yuHHandler yuhHandler = new yuHHandler();
	yoHHandler yohHandler = new yoHHandler();
	raHHandler rahHandler = new raHHandler();
	riHHandler rihHandler = new riHHandler();
	ruHHandler ruhHandler = new ruHHandler();
	reHHandler rehHandler = new reHHandler();
	roHHandler rohHandler = new roHHandler();
	waHHandler wahHandler = new waHHandler();
	nHHandler nhHandler = new nHHandler();
	woHHandler wohHandler = new woHHandler();

	aKHandler akHandler = new aKHandler();
	iKHandler ikHandler = new iKHandler();
	uKHandler ukHandler = new uKHandler();
	eKHandler ekHandler = new eKHandler();
	oKHandler okHandler = new oKHandler();
	kaKHandler kakHandler = new kaKHandler();
	kiKHandler kikHandler = new kiKHandler();
	kuKHandler kukHandler = new kuKHandler();
	keKHandler kekHandler = new keKHandler();
	koKHandler kokHandler = new koKHandler();
	saKHandler sakHandler = new saKHandler();
	siKHandler sikHandler = new siKHandler();
	suKHandler sukHandler = new suKHandler();
	seKHandler sekHandler = new seKHandler();
	soKHandler sokHandler = new soKHandler();
	taKHandler takHandler = new taKHandler();
	tiKHandler tikHandler = new tiKHandler();
	tuKHandler tukHandler = new tuKHandler();
	teKHandler tekHandler = new teKHandler();
	toKHandler tokHandler = new toKHandler();
	naKHandler nakHandler = new naKHandler();
	niKHandler nikHandler = new niKHandler();
	nuKHandler nukHandler = new nuKHandler();
	neKHandler nekHandler = new neKHandler();
	noKHandler nokHandler = new noKHandler();
	haKHandler hakHandler = new haKHandler();
	hiKHandler hikHandler = new hiKHandler();
	huKHandler hukHandler = new huKHandler();
	heKHandler hekHandler = new heKHandler();
	hoKHandler hokHandler = new hoKHandler();
	maKHandler makHandler = new maKHandler();
	miKHandler mikHandler = new miKHandler();
	muKHandler mukHandler = new muKHandler();
	meKHandler mekHandler = new meKHandler();
	moKHandler mokHandler = new moKHandler();
	yaKHandler yakHandler = new yaKHandler();
	yuKHandler yukHandler = new yuKHandler();
	yoKHandler yokHandler = new yoKHandler();
	raKHandler rakHandler = new raKHandler();
	riKHandler rikHandler = new riKHandler();
	ruKHandler rukHandler = new ruKHandler();
	reKHandler rekHandler = new reKHandler();
	roKHandler rokHandler = new roKHandler();
	waKHandler wakHandler = new waKHandler();
	nKHandler nkHandler = new nKHandler();
	woKHandler wokHandler = new woKHandler();
	
	chooseHiraganaHandler chHandler = new chooseHiraganaHandler();
	chooseKatakanaHandler ckHandler = new chooseKatakanaHandler();
	


	public static BufferedImage menu_image = null; // it's static because we're only going to have one sprite sheet in
	// the game, so it doesn't matter that it's static; there's no confusion
	// since there's only going to be one single spreadsheet we're going to call from
	public static BufferedImage help_image = null;
	public static BufferedImage play_image = null;

	public static final int WIDTH = 1280, HEIGHT = 720;



	public Game() {
		BufferedImageLoader loader = new BufferedImageLoader();
		menu_image = loader.loadImage("/menu_image.png");
		help_image = loader.loadImage("/help_image.png");
		play_image = loader.loadImage("/play_image.png");



		frame = new JFrame("Japanese Hiragana and Katakana");	// we've created a JFrame
		// which is the frame of our window
		// it's an inbuilt library within java JRE
		// we use it and set the frames whenever
		// we say frame.------

		// We can say Jframe("Japanese Hirgana and Katakana")
		// instead of Jframe(title) if we wanted. Whichever is preferred

		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setResizable(false);	// this just means can we resize our window
		// and we set it to no atm because it'll cause 
		// problems later on if we allow it
		frame.setLocationRelativeTo(null);	// this makes it so that the window starts
		// in the middle of the screen instead of the 
		// top left since it's put to null
		//frame.setLayout(null);	// PLAY AROUND WITH THIS SOME MORE TO FIND OUT WHAT IT DOES
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this makes it
		// so that the red X button on the top right corner actually working

		frame.setVisible(true);	// sets the frame to visible so we can actually see it
		
		//********************************************************************************************************
		// CONVERTING UNICODE CHARACTERS
		//********************************************************************************************************
//		JTextPane textPane = new JTextPane();	// Need the JTextPane if you want to convert unicode characters
//	    System.out.println(String.valueOf("\u3042 \u3044 \u3046 \u3048 \u304A"));
//	    textPane.setContentType("text/html");
//	    textPane.setText("c'est " + String.valueOf("\u3042 \u3044 \u3046 \u3048 \u304A"));
//	    frame.getContentPane().add(textPane, BorderLayout.CENTER);
//	    frame.pack();            // Add these
	
		
		
		
		con = frame.getContentPane();		

		// Background Panel
		iconMenu = new ImageIcon(menu_image);

		// JLabel
		menuLabel = new JLabel(iconMenu);
		menuLabel.setBounds(0, 0, 1280, 720);	

		// JPanel
		playButtonPanel = new JPanel();
		playButtonPanel.setBounds(985, 280, 100, 54);
		playButtonPanel.setBackground(Color.black);
		helpButtonPanel = new JPanel();
		helpButtonPanel.setBounds(985, 360, 100, 54);
		helpButtonPanel.setBackground(Color.black);
		quitButtonPanel = new JPanel();
		quitButtonPanel.setBounds(985, 440, 100, 54);
		quitButtonPanel.setBackground(Color.black);


		// JButton
		playButton = new JButton("Play");	
		playButton.setBackground(Color.black);	// Color of the button
		playButton.setForeground(Color.white);	// Color of the text of this button
		playButton.setFont(font);
		playButton.addActionListener(psHandler);		// When you click on the play button, it recognizes the click and calls psHandler
		helpButton = new JButton("Help");	
		helpButton.setBackground(Color.black);	// Color of the button
		helpButton.setForeground(Color.white);	// Color of the text of this button
		helpButton.setFont(font);
		helpButton.addActionListener(hsHandler);		// When you click on the help button, it recognizes the click and calls hsHandler
		quitButton = new JButton("Quit");	
		quitButton.setBackground(Color.black);	// Color of the button
		quitButton.setForeground(Color.white);	// Color of the text of this button
		quitButton.setFont(font);
		quitButton.addActionListener(qsHandler);		// When you click on the quit button, it recognizes the click and calls qsHandler

		//Placing the jbutton on to the jpanel
		playButtonPanel.add(playButton);
		helpButtonPanel.add(helpButton);
		quitButtonPanel.add(quitButton);

		// Container
		con.add(playButtonPanel);
		con.add(helpButtonPanel);
		con.add(quitButtonPanel);
		con.add(menuLabel);
	}
/***********************************************************************************************************************************************
 *	The following classes will make a screen for the user indicating what buttons to show or set visible
 *	and showing an image, which is used as an ImageIcon and zoomed in to fit the screen, so that it can be
 * 	the background for one of the specific screens
 * 
 ***********************************************************************************************************************************************/
	public void createPlayScreen() {

		playButtonPanel.setVisible(false);
		helpButtonPanel.setVisible(false);
		quitButtonPanel.setVisible(false);
		menuLabel.setIcon(null);			// REMOVES THE MENU ICON

		// Background Panel
		iconPlay = new ImageIcon(play_image);

		// JLabel
		playLabel = new JLabel(iconPlay);
		playLabel.setBounds(0, 0, 1280, 720);

		// JPanel
		backPlayButtonPanel = new JPanel();
		backPlayButtonPanel.setBounds(210, 550, 100, 54);
		backPlayButtonPanel.setBackground(Color.black);
		KatakanaButtonPanel = new JPanel();
		KatakanaButtonPanel.setBounds(760, 360, 150, 54);
		KatakanaButtonPanel.setBackground(Color.black);
		HiraganaButtonPanel = new JPanel();
		HiraganaButtonPanel.setBounds(110, 360, 150, 54);
		HiraganaButtonPanel.setBackground(Color.black);
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(300, 100, 550, 54);
		mainTextPanel.setBackground(Color.white);


		// JButton
		backPlayButton = new JButton("Back");	
		backPlayButton.setBackground(Color.black);	// Color of the button
		backPlayButton.setForeground(Color.white);	// Color of the text of this button
		backPlayButton.setFont(font);
		backPlayButton.addActionListener(bpsHandler);	// Action allows the back button to go to back to menu
		KatakanaButton = new JButton("Katakana");
		KatakanaButton.setBackground(Color.black);
		KatakanaButton.setForeground(Color.white);
		KatakanaButton.setFont(font);
		KatakanaButton.addActionListener(kcshandler); 	// Action allows the hiragana button to go to the hiragana screen
		HiraganaButton = new JButton("Hiragana");
		HiraganaButton.setBackground(Color.black);
		HiraganaButton.setForeground(Color.white);
		HiraganaButton.setFont(font);
		HiraganaButton.addActionListener(hcshandler);	// Action allows the hiragana button to go to the hiragana screen


		// JTextArea
		mainTextArea = new JTextArea("Which one do you want to practice?");
		mainTextArea.setBounds(100, 100, 550, 250);
		mainTextArea.setBackground(Color.white);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(font);
		mainTextArea.setLineWrap(true);	// This wrap makes it so that if the text is too long
										// then it will be locked automatically, meaning it will go to the next line if necessary
		mainTextArea.setEditable(false);// This makes it so that users cannot edit the text on purpose or by accident in the gui
		
		
		// Placing the JButton on to the JPanel
		backPlayButtonPanel.add(backPlayButton);
		KatakanaButtonPanel.add(KatakanaButton);
		HiraganaButtonPanel.add(HiraganaButton);
		mainTextPanel.add(mainTextArea);


		// Container
		con.add(backPlayButtonPanel);
		con.add(KatakanaButtonPanel);
		con.add(HiraganaButtonPanel);
		con.add(mainTextPanel);
		con.add(playLabel);

	}
	public void createHelpScreen() {
		playButtonPanel.setVisible(false);
		helpButtonPanel.setVisible(false);
		quitButtonPanel.setVisible(false);
		menuLabel.setIcon(null);			// REMOVES THE MENU ICON

		//Background Panel
		iconHelp = new ImageIcon(help_image);

		// JLabel
		helpLabel = new JLabel(iconHelp);
		helpLabel.setBounds(0, 0, 1280, 720);

		// JPanel
		backHelpButtonPanel = new JPanel();
		backHelpButtonPanel.setBounds(210, 550, 100, 54);
		backHelpButtonPanel.setBackground(Color.black);
//		mainTextPanel = new JPanel();
//		mainTextPanel.setBounds(300, 80, 600, 80);	// The dimensions of the box in the background where the "textbox" is on
//		mainTextPanel.setBackground(Color.white);

		// JButton
		backHelpButton = new JButton("Back");	
		backHelpButton.setBackground(Color.black);	// Color of the button
		backHelpButton.setForeground(Color.white);	// Color of the text of this button
		backHelpButton.setFont(font);
		backHelpButton.addActionListener(bhsHandler);

		// JTextArea
//		mainTextArea = new JTextArea("Hopefully this will help you to practice hiragana and katakana.\n"
//									+ "It's a simple program that taught me how to load images and\n"
//									+ "get used to using a graphical user interface.");
//		mainTextArea.setBounds(100, 100, 600, 150);	// The dimensions of the box where the text is on
//		mainTextArea.setBackground(Color.white);
//		mainTextArea.setForeground(Color.black);
//		mainTextArea.setFont(font2);
//		mainTextArea.setLineWrap(true);	// This wrap makes it so that if the text is too long
//										// then it will be locked automatically, meaning it will go to the next line if necessary
//		mainTextArea.setEditable(false);// This makes it so that users cannot edit the text on purpose or by accident in the gui

		// Placing the jbutton on to the jpanel
		backHelpButtonPanel.add(backHelpButton);
//		mainTextPanel.add(mainTextArea);
		
		
		// Container
		con.add(backHelpButtonPanel);
//		con.add(mainTextPanel);
		con.add(helpLabel);
		
		textPane = new JTextPane();	// Need the JTextPane if you want to convert unicode characters
	    textPane.setText("\n\t\t\tHopefully this will help you to practice hiragana and katakana.\n"
	    		+ "\t\t\tIt's a simple program that taught me how to load images and\n"
	    		+ "\t\t\tget used to using a graphical user interface. I've also learned\n"
	    		+ "\t\t\thow to show unicode characters and receive input in a gui.");
	    textPane.setFont(font2);
	    textPane.setEditable(false);
	    frame.getContentPane().add(textPane, BorderLayout.NORTH);
//	    frame.pack();            // Don't add this unless you're dealing with japanese characters; otherwise,
	    						 // the hiragana and katakana screen will be buggy
	}
	
	public void createHCharacterScreen() {

		backPlayButtonPanel.setVisible(false);
		KatakanaButtonPanel.setVisible(false);
		HiraganaButtonPanel.setVisible(false);
		mainTextPanel.setVisible(false);
		
		playLabel.setIcon(null);			// REMOVES THE PLAY ICON

		// Background Panel
//		iconPlay = new ImageIcon(play_image);

		// JLabel
//		playLabel = new JLabel(iconPlay);
//		playLabel.setBounds(0, 0, 1280, 720);

		// JPanel
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(0, 0, 0, 0);
		mainTextPanel.setBackground(Color.white);
		aHButtonPanel = new JPanel();
		aHButtonPanel.setBounds(1000, 150, 50, 50);
		aHButtonPanel.setBackground(Color.white);
		iHButtonPanel = new JPanel();
		iHButtonPanel.setBounds(1000, 250, 50, 50);
		iHButtonPanel.setBackground(Color.white);
		uHButtonPanel = new JPanel();
		uHButtonPanel.setBounds(1000, 350, 50, 50);
		uHButtonPanel.setBackground(Color.white);
		eHButtonPanel = new JPanel();
		eHButtonPanel.setBounds(1000, 440, 50, 50);
		eHButtonPanel.setBackground(Color.white);
		oHButtonPanel = new JPanel();
		oHButtonPanel.setBounds(1000, 535, 50, 50);
		oHButtonPanel.setBackground(Color.white);     
		kaHButtonPanel = new JPanel();
		kaHButtonPanel.setBounds(900, 150, 50, 50);
		kaHButtonPanel.setBackground(Color.white);
		kiHButtonPanel = new JPanel();
		kiHButtonPanel.setBounds(900, 250, 50, 50);
		kiHButtonPanel.setBackground(Color.white);
		kuHButtonPanel = new JPanel();
		kuHButtonPanel.setBounds(900, 350, 50, 50);
		kuHButtonPanel.setBackground(Color.white);
		keHButtonPanel = new JPanel();
		keHButtonPanel.setBounds(900, 440, 50, 50);
		keHButtonPanel.setBackground(Color.white);
		koHButtonPanel = new JPanel();
		koHButtonPanel.setBounds(900, 535, 50, 50);
		koHButtonPanel.setBackground(Color.white); 
		saHButtonPanel = new JPanel();
		saHButtonPanel.setBounds(800, 150, 50, 50);
		saHButtonPanel.setBackground(Color.white);
		siHButtonPanel = new JPanel();
		siHButtonPanel.setBounds(800, 250, 50, 50);
		siHButtonPanel.setBackground(Color.white);
		suHButtonPanel = new JPanel();
		suHButtonPanel.setBounds(800, 350, 50, 50);
		suHButtonPanel.setBackground(Color.white);
		seHButtonPanel = new JPanel();
		seHButtonPanel.setBounds(800, 440, 50, 50);
		seHButtonPanel.setBackground(Color.white);
		soHButtonPanel = new JPanel();
		soHButtonPanel.setBounds(800, 535, 50, 50);
		soHButtonPanel.setBackground(Color.white);
		taHButtonPanel = new JPanel();
		taHButtonPanel.setBounds(700, 150, 50, 50);
		taHButtonPanel.setBackground(Color.white);
		tiHButtonPanel = new JPanel();
		tiHButtonPanel.setBounds(700, 250, 50, 50);
		tiHButtonPanel.setBackground(Color.white);
		tuHButtonPanel = new JPanel();
		tuHButtonPanel.setBounds(700, 350, 50, 50);
		tuHButtonPanel.setBackground(Color.white);
		teHButtonPanel = new JPanel();
		teHButtonPanel.setBounds(700, 440, 50, 50);
		teHButtonPanel.setBackground(Color.white);
		toHButtonPanel = new JPanel();
		toHButtonPanel.setBounds(700, 535, 50, 50);
		toHButtonPanel.setBackground(Color.white);   
		naHButtonPanel = new JPanel();
		naHButtonPanel.setBounds(600, 150, 50, 50);
		naHButtonPanel.setBackground(Color.white);
		niHButtonPanel = new JPanel();
		niHButtonPanel.setBounds(600, 250, 50, 50);
		niHButtonPanel.setBackground(Color.white);
		nuHButtonPanel = new JPanel();
		nuHButtonPanel.setBounds(600, 350, 50, 50);
		nuHButtonPanel.setBackground(Color.white);
		neHButtonPanel = new JPanel();
		neHButtonPanel.setBounds(600, 440, 50, 50);
		neHButtonPanel.setBackground(Color.white);
		noHButtonPanel = new JPanel();
		noHButtonPanel.setBounds(600, 535, 50, 50);
		noHButtonPanel.setBackground(Color.white);   
		haHButtonPanel = new JPanel();
		haHButtonPanel.setBounds(500, 150, 50, 50);
		haHButtonPanel.setBackground(Color.white);
		hiHButtonPanel = new JPanel();
		hiHButtonPanel.setBounds(500, 250, 50, 50);
		hiHButtonPanel.setBackground(Color.white);
		huHButtonPanel = new JPanel();
		huHButtonPanel.setBounds(500, 350, 50, 50);
		huHButtonPanel.setBackground(Color.white);
		heHButtonPanel = new JPanel();
		heHButtonPanel.setBounds(500, 440, 50, 50);
		heHButtonPanel.setBackground(Color.white);
		hoHButtonPanel = new JPanel();
		hoHButtonPanel.setBounds(500, 535, 50, 50);
		hoHButtonPanel.setBackground(Color.white);  
		maHButtonPanel = new JPanel();
		maHButtonPanel.setBounds(400, 150, 50, 50);
		maHButtonPanel.setBackground(Color.white);
		miHButtonPanel = new JPanel();
		miHButtonPanel.setBounds(400, 250, 50, 50);
		miHButtonPanel.setBackground(Color.white);
		muHButtonPanel = new JPanel();
		muHButtonPanel.setBounds(400, 350, 50, 50);
		muHButtonPanel.setBackground(Color.white);
		meHButtonPanel = new JPanel();
		meHButtonPanel.setBounds(400, 440, 50, 50);
		meHButtonPanel.setBackground(Color.white);
		moHButtonPanel = new JPanel();
		moHButtonPanel.setBounds(400, 535, 50, 50);
		moHButtonPanel.setBackground(Color.white);
		yaHButtonPanel = new JPanel();
		yaHButtonPanel.setBounds(300, 150, 50, 50);
		yaHButtonPanel.setBackground(Color.white);
		yuHButtonPanel = new JPanel();
		yuHButtonPanel.setBounds(300, 350, 50, 50);
		yuHButtonPanel.setBackground(Color.white);
		yoHButtonPanel = new JPanel();
		yoHButtonPanel.setBounds(300, 535, 50, 50);
		yoHButtonPanel.setBackground(Color.white);  
		raHButtonPanel = new JPanel();
		raHButtonPanel.setBounds(200, 150, 50, 50);
		raHButtonPanel.setBackground(Color.white);
		riHButtonPanel = new JPanel();
		riHButtonPanel.setBounds(200, 250, 50, 50);
		riHButtonPanel.setBackground(Color.white);
		ruHButtonPanel = new JPanel();
		ruHButtonPanel.setBounds(200, 350, 50, 50);
		ruHButtonPanel.setBackground(Color.white);
		reHButtonPanel = new JPanel();
		reHButtonPanel.setBounds(200, 440, 50, 50);
		reHButtonPanel.setBackground(Color.white);
		roHButtonPanel = new JPanel();
		roHButtonPanel.setBounds(200, 535, 50, 50);
		roHButtonPanel.setBackground(Color.white); 
		waHButtonPanel = new JPanel();
		waHButtonPanel.setBounds(100, 150, 50, 50);
		waHButtonPanel.setBackground(Color.white);
		nHButtonPanel = new JPanel();
		nHButtonPanel.setBounds(100, 350, 50, 50);
		nHButtonPanel.setBackground(Color.white);
		woHButtonPanel = new JPanel();
		woHButtonPanel.setBounds(100, 535, 50, 50);
		woHButtonPanel.setBackground(Color.white);  
		chooseHButtonPanel = new JPanel();
		chooseHButtonPanel.setBounds(400, 0, 400, 64);
		chooseHButtonPanel.setBackground(Color.white);
		
	    
		// JButton
		aHButton = new JButton("a");	
		aHButton.setBackground(Color.black);	// Color of the button
		aHButton.setForeground(Color.white);	// Color of the text of this button
		aHButton.setFont(font2);
		aHButton.addActionListener(ahHandler);
		iHButton = new JButton("i");	
		iHButton.setBackground(Color.black);	// Color of the button
		iHButton.setForeground(Color.white);	// Color of the text of this button
		iHButton.setFont(font2);
		iHButton.addActionListener(ihHandler);
		uHButton = new JButton("u");	
		uHButton.setBackground(Color.black);	// Color of the button
		uHButton.setForeground(Color.white);	// Color of the text of this button
		uHButton.setFont(font2);
		uHButton.addActionListener(uhHandler);
		eHButton = new JButton("e");	
		eHButton.setBackground(Color.black);	// Color of the button
		eHButton.setForeground(Color.white);	// Color of the text of this button
		eHButton.setFont(font2);
		eHButton.addActionListener(ehHandler);
		oHButton = new JButton("o");	
		oHButton.setBackground(Color.black);	// Color of the button
		oHButton.setForeground(Color.white);	// Color of the text of this button
		oHButton.setFont(font2);
		oHButton.addActionListener(ohHandler);
		kaHButton = new JButton("ka");
		kaHButton.setBackground(Color.black);	// Color of the button
		kaHButton.setForeground(Color.white);	// Color of the text of this button
		kaHButton.setFont(font2);
		kaHButton.addActionListener(kahHandler);
		kiHButton = new JButton("ki");	
		kiHButton.setBackground(Color.black);	// Color of the button
		kiHButton.setForeground(Color.white);	// Color of the text of this button
		kiHButton.setFont(font2);
		kiHButton.addActionListener(kihHandler);
		kuHButton = new JButton("ku");	
		kuHButton.setBackground(Color.black);	// Color of the button
		kuHButton.setForeground(Color.white);	// Color of the text of this button
		kuHButton.setFont(font2);
		kuHButton.addActionListener(kuhHandler);
		keHButton = new JButton("ke");	
		keHButton.setBackground(Color.black);	// Color of the button
		keHButton.setForeground(Color.white);	// Color of the text of this button
		keHButton.setFont(font2);
		keHButton.addActionListener(kehHandler);
		koHButton = new JButton("ko");	
		koHButton.setBackground(Color.black);	// Color of the button
		koHButton.setForeground(Color.white);	// Color of the text of this button
		koHButton.setFont(font2);
		koHButton.addActionListener(kohHandler);
		saHButton = new JButton("sa");	
		saHButton.setBackground(Color.black);	// Color of the button
		saHButton.setForeground(Color.white);	// Color of the text of this button
		saHButton.setFont(font2);
		saHButton.addActionListener(sahHandler);
		siHButton = new JButton("shi");	
		siHButton.setBackground(Color.black);	// Color of the button
		siHButton.setForeground(Color.white);	// Color of the text of this button
		siHButton.setFont(font2);
		siHButton.addActionListener(sihHandler);
		suHButton = new JButton("su");	
		suHButton.setBackground(Color.black);	// Color of the button
		suHButton.setForeground(Color.white);	// Color of the text of this button
		suHButton.setFont(font2);
		suHButton.addActionListener(suhHandler);
		seHButton = new JButton("se");	
		seHButton.setBackground(Color.black);	// Color of the button
		seHButton.setForeground(Color.white);	// Color of the text of this button
		seHButton.setFont(font2);
		seHButton.addActionListener(sehHandler);
		soHButton = new JButton("so");	
		soHButton.setBackground(Color.black);	// Color of the button
		soHButton.setForeground(Color.white);	// Color of the text of this button
		soHButton.setFont(font2);
		soHButton.addActionListener(sohHandler);
		taHButton = new JButton("ta");	
		taHButton.setBackground(Color.black);	// Color of the button
		taHButton.setForeground(Color.white);	// Color of the text of this button
		taHButton.setFont(font2);
		taHButton.addActionListener(tahHandler);
		tiHButton = new JButton("chi");	
		tiHButton.setBackground(Color.black);	// Color of the button
		tiHButton.setForeground(Color.white);	// Color of the text of this button
		tiHButton.setFont(font2);
		tiHButton.addActionListener(tihHandler);
		tuHButton = new JButton("tsu");	
		tuHButton.setBackground(Color.black);	// Color of the button
		tuHButton.setForeground(Color.white);	// Color of the text of this button
		tuHButton.setFont(font2);
		tuHButton.addActionListener(tuhHandler);
		teHButton = new JButton("te");	
		teHButton.setBackground(Color.black);	// Color of the button
		teHButton.setForeground(Color.white);	// Color of the text of this button
		teHButton.setFont(font2);
		teHButton.addActionListener(tehHandler);
		toHButton = new JButton("to");	
		toHButton.setBackground(Color.black);	// Color of the button
		toHButton.setForeground(Color.white);	// Color of the text of this button
		toHButton.setFont(font2);
		toHButton.addActionListener(tohHandler);
		naHButton = new JButton("na");	
		naHButton.setBackground(Color.black);	// Color of the button
		naHButton.setForeground(Color.white);	// Color of the text of this button
		naHButton.setFont(font2);
		naHButton.addActionListener(nahHandler);
		niHButton = new JButton("ni");	
		niHButton.setBackground(Color.black);	// Color of the button
		niHButton.setForeground(Color.white);	// Color of the text of this button
		niHButton.setFont(font2);
		niHButton.addActionListener(nihHandler);
		nuHButton = new JButton("nu");	
		nuHButton.setBackground(Color.black);	// Color of the button
		nuHButton.setForeground(Color.white);	// Color of the text of this button
		nuHButton.setFont(font2);
		nuHButton.addActionListener(nuhHandler);
		neHButton = new JButton("ne");	
		neHButton.setBackground(Color.black);	// Color of the button
		neHButton.setForeground(Color.white);	// Color of the text of this button
		neHButton.setFont(font2);
		neHButton.addActionListener(nehHandler);
		noHButton = new JButton("no");	
		noHButton.setBackground(Color.black);	// Color of the button
		noHButton.setForeground(Color.white);	// Color of the text of this button
		noHButton.setFont(font2);
		noHButton.addActionListener(nohHandler);
		haHButton = new JButton("ha");	
		haHButton.setBackground(Color.black);	// Color of the button
		haHButton.setForeground(Color.white);	// Color of the text of this button
		haHButton.setFont(font2);
		haHButton.addActionListener(hahHandler);
		hiHButton = new JButton("hi");	
		hiHButton.setBackground(Color.black);	// Color of the button
		hiHButton.setForeground(Color.white);	// Color of the text of this button
		hiHButton.setFont(font2);
		hiHButton.addActionListener(hihHandler);
		huHButton = new JButton("fu");	
		huHButton.setBackground(Color.black);	// Color of the button
		huHButton.setForeground(Color.white);	// Color of the text of this button
		huHButton.setFont(font2);
		huHButton.addActionListener(huhHandler);
		heHButton = new JButton("he");	
		heHButton.setBackground(Color.black);	// Color of the button
		heHButton.setForeground(Color.white);	// Color of the text of this button
		heHButton.setFont(font2);
		heHButton.addActionListener(hehHandler);
		hoHButton = new JButton("ho");	
		hoHButton.setBackground(Color.black);	// Color of the button
		hoHButton.setForeground(Color.white);	// Color of the text of this button
		hoHButton.setFont(font2);
		hoHButton.addActionListener(hohHandler);
		maHButton = new JButton("ma");	
		maHButton.setBackground(Color.black);	// Color of the button
		maHButton.setForeground(Color.white);	// Color of the text of this button
		maHButton.setFont(font2);
		maHButton.addActionListener(mahHandler);
		miHButton = new JButton("mi");	
		miHButton.setBackground(Color.black);	// Color of the button
		miHButton.setForeground(Color.white);	// Color of the text of this button
		miHButton.setFont(font2);
		miHButton.addActionListener(mihHandler);
		muHButton = new JButton("mu");	
		muHButton.setBackground(Color.black);	// Color of the button
		muHButton.setForeground(Color.white);	// Color of the text of this button
		muHButton.setFont(font2);
		muHButton.addActionListener(muhHandler);
		meHButton = new JButton("me");	
		meHButton.setBackground(Color.black);	// Color of the button
		meHButton.setForeground(Color.white);	// Color of the text of this button
		meHButton.setFont(font2);
		meHButton.addActionListener(mehHandler);
		moHButton = new JButton("mo");	
		moHButton.setBackground(Color.black);	// Color of the button
		moHButton.setForeground(Color.white);	// Color of the text of this button
		moHButton.setFont(font2);
		moHButton.addActionListener(mohHandler);
		yaHButton = new JButton("ya");	
		yaHButton.setBackground(Color.black);	// Color of the button
		yaHButton.setForeground(Color.white);	// Color of the text of this button
		yaHButton.setFont(font2);
		yaHButton.addActionListener(yahHandler);
		yuHButton = new JButton("yu");	
		yuHButton.setBackground(Color.black);	// Color of the button
		yuHButton.setForeground(Color.white);	// Color of the text of this button
		yuHButton.setFont(font2);
		yuHButton.addActionListener(yuhHandler);
		yoHButton = new JButton("yo");	
		yoHButton.setBackground(Color.black);	// Color of the button
		yoHButton.setForeground(Color.white);	// Color of the text of this button
		yoHButton.setFont(font2);
		yoHButton.addActionListener(yohHandler);
		raHButton = new JButton("ra");	
		raHButton.setBackground(Color.black);	// Color of the button
		raHButton.setForeground(Color.white);	// Color of the text of this button
		raHButton.setFont(font2);
		raHButton.addActionListener(rahHandler);
		riHButton = new JButton("ri");	
		riHButton.setBackground(Color.black);	// Color of the button
		riHButton.setForeground(Color.white);	// Color of the text of this button
		riHButton.setFont(font2);
		riHButton.addActionListener(rihHandler);
		ruHButton = new JButton("ru");	
		ruHButton.setBackground(Color.black);	// Color of the button
		ruHButton.setForeground(Color.white);	// Color of the text of this button
		ruHButton.setFont(font2);
		ruHButton.addActionListener(ruhHandler);
		reHButton = new JButton("re");	
		reHButton.setBackground(Color.black);	// Color of the button
		reHButton.setForeground(Color.white);	// Color of the text of this button
		reHButton.setFont(font2);
		reHButton.addActionListener(rehHandler);
		roHButton = new JButton("ro");	
		roHButton.setBackground(Color.black);	// Color of the button
		roHButton.setForeground(Color.white);	// Color of the text of this button
		roHButton.setFont(font2);
		roHButton.addActionListener(rohHandler);
		waHButton = new JButton("wa");	
		waHButton.setBackground(Color.black);	// Color of the button
		waHButton.setForeground(Color.white);	// Color of the text of this button
		waHButton.setFont(font2);
		waHButton.addActionListener(wahHandler);
		nHButton = new JButton("n");	
		nHButton.setBackground(Color.black);	// Color of the button
		nHButton.setForeground(Color.white);	// Color of the text of this button
		nHButton.setFont(font2);
		nHButton.addActionListener(nhHandler);
		woHButton = new JButton("wo");	
		woHButton.setBackground(Color.black);	// Color of the button
		woHButton.setForeground(Color.white);	// Color of the text of this button
		woHButton.setFont(font2);
		woHButton.addActionListener(wohHandler);
		chooseHButton = new JButton("Choose the characters to study");
		chooseHButton.setBackground(Color.black);
		chooseHButton.setForeground(Color.white);
		chooseHButton.setFont(font2);
		chooseHButton.addActionListener(chHandler);


		// JTextArea
		mainTextArea = new JTextArea("");
		mainTextArea.setBounds(0, 0, 0, 0);
		mainTextArea.setBackground(Color.white);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(font);
		mainTextArea.setLineWrap(true);	// This wrap makes it so that if the text is too long
										// then it will be locked automatically, meaning it will go to the next line if necessary
		mainTextArea.setEditable(false);// This makes it so that users cannot edit the text on purpose or by accident in the gui
		
		
		// Placing the JButton on to the JPanel
		aHButtonPanel.add(aHButton);
		iHButtonPanel.add(iHButton);
		uHButtonPanel.add(uHButton);
		eHButtonPanel.add(eHButton);
		oHButtonPanel.add(oHButton);
		kaHButtonPanel.add(kaHButton);
		kiHButtonPanel.add(kiHButton);
		kuHButtonPanel.add(kuHButton);
		keHButtonPanel.add(keHButton);
		koHButtonPanel.add(koHButton);
		saHButtonPanel.add(saHButton);
		siHButtonPanel.add(siHButton);
		suHButtonPanel.add(suHButton);
		seHButtonPanel.add(seHButton);
		soHButtonPanel.add(soHButton);
		taHButtonPanel.add(taHButton);
		tiHButtonPanel.add(tiHButton);
		tuHButtonPanel.add(tuHButton);
		teHButtonPanel.add(teHButton);
		toHButtonPanel.add(toHButton);
		naHButtonPanel.add(naHButton);
		niHButtonPanel.add(niHButton);
		nuHButtonPanel.add(nuHButton);
		neHButtonPanel.add(neHButton);
		noHButtonPanel.add(noHButton);
		haHButtonPanel.add(haHButton);
		hiHButtonPanel.add(hiHButton);
		huHButtonPanel.add(huHButton);
		heHButtonPanel.add(heHButton);
		hoHButtonPanel.add(hoHButton);
		maHButtonPanel.add(maHButton);
		miHButtonPanel.add(miHButton);
		muHButtonPanel.add(muHButton);
		meHButtonPanel.add(meHButton);
		moHButtonPanel.add(moHButton);
		yaHButtonPanel.add(yaHButton);	
		yuHButtonPanel.add(yuHButton);
		yoHButtonPanel.add(yoHButton);
		raHButtonPanel.add(raHButton);
		riHButtonPanel.add(riHButton);
		ruHButtonPanel.add(ruHButton);
		reHButtonPanel.add(reHButton);
		roHButtonPanel.add(roHButton);
		waHButtonPanel.add(waHButton);
		nHButtonPanel.add(nHButton);
		woHButtonPanel.add(woHButton);
		mainTextPanel.add(mainTextArea);
		chooseHButtonPanel.add(chooseHButton);


		// Container
		con.add(aHButtonPanel);
		con.add(iHButtonPanel);
		con.add(uHButtonPanel);
		con.add(eHButtonPanel);
		con.add(oHButtonPanel);
		con.add(kaHButtonPanel);
		con.add(kiHButtonPanel);
		con.add(kuHButtonPanel);
		con.add(keHButtonPanel);
		con.add(koHButtonPanel);
		con.add(saHButtonPanel);
		con.add(siHButtonPanel);
		con.add(suHButtonPanel);
		con.add(seHButtonPanel);
		con.add(soHButtonPanel);
		con.add(taHButtonPanel);
		con.add(tiHButtonPanel);
		con.add(tuHButtonPanel);
		con.add(teHButtonPanel);
		con.add(toHButtonPanel);
		con.add(naHButtonPanel);
		con.add(niHButtonPanel);
		con.add(nuHButtonPanel);
		con.add(neHButtonPanel);
		con.add(noHButtonPanel);
		con.add(haHButtonPanel);
		con.add(hiHButtonPanel);
		con.add(huHButtonPanel);
		con.add(heHButtonPanel);
		con.add(hoHButtonPanel);
		con.add(maHButtonPanel);
		con.add(miHButtonPanel);
		con.add(muHButtonPanel);
		con.add(meHButtonPanel);
		con.add(moHButtonPanel);
		con.add(yaHButtonPanel);
		con.add(yuHButtonPanel);
		con.add(yoHButtonPanel);
		con.add(raHButtonPanel);
		con.add(riHButtonPanel);
		con.add(ruHButtonPanel);
		con.add(reHButtonPanel);
		con.add(roHButtonPanel);
		con.add(waHButtonPanel);
		con.add(nHButtonPanel);
		con.add(woHButtonPanel);
		con.add(chooseHButtonPanel);
		con.add(mainTextPanel);

		//JTextPane hPane = new JTextPane();	// Need the JTextPane if you want to convert unicode characters
		hPane.setText(String.valueOf("\n\n\n\n\n\u308F"
	    		+ "              \u3089           \u3084"
	    		+ "             \u307E             \u306F"
	    		+ "               \u306A             \u305F"
	    		+ "             \u3055             \u304B             \u3042                                     "
	    		+ "\n\n\n\n ` "
	    		+ "              \u308A            ` "
	    		+ "             \u307F             \u3072"
	    		+ "               \u306B             \u3061"
	    		+ "             \u3057             \u304D             \u3044"
	    		+ "\n\n\n\n\u3093"
	    		+ "              \u308B           \u3086"
	    		+ "             \u3080             \u3075"
	    		+ "               \u306C             \u3064"
	    		+ "             \u3059             \u304F             \u3046"
	    		+ "\n\n\n\n ` "
	    		+ "              \u308C             `"
	    		+ "              \u3081             \u3078"
	    		+ "               \u306D             \u3066"
	    		+ "             \u305B             \u3051             \u3048"
	    		+ "\n\n\n\n\u3092"
	    		+ "              \u308D           \u3088"
	    		+ "             \u3082             \u307B"
	    		+ "               \u306E             \u3068"
	    		+ "             \u305D             \u3053             \u304A"));
		hPane.setFont(font2);
		hPane.setEditable(false);
	    frame.getContentPane().add(hPane, BorderLayout.LINE_END);
	    frame.pack();            // Add these
	}
	
	public void createKCharacterScreen() {

		backPlayButtonPanel.setVisible(false);
		KatakanaButtonPanel.setVisible(false);
		HiraganaButtonPanel.setVisible(false);
		mainTextPanel.setVisible(false);
		
		playLabel.setIcon(null);			// REMOVES THE PLAY ICON

		// Background Panel
//		iconPlay = new ImageIcon(play_image);

		// JLabel
//		playLabel = new JLabel(iconPlay);
//		playLabel.setBounds(0, 0, 1280, 720);

		// JPanel
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(0, 0, 0, 0);
		mainTextPanel.setBackground(Color.white);
		aKButtonPanel = new JPanel();
		aKButtonPanel.setBounds(1000, 150, 50, 50);
		aKButtonPanel.setBackground(Color.white);
		iKButtonPanel = new JPanel();
		iKButtonPanel.setBounds(1000, 250, 50, 50);
		iKButtonPanel.setBackground(Color.white);
		uKButtonPanel = new JPanel();
		uKButtonPanel.setBounds(1000, 350, 50, 50);
		uKButtonPanel.setBackground(Color.white);
		eKButtonPanel = new JPanel();
		eKButtonPanel.setBounds(1000, 440, 50, 50);
		eKButtonPanel.setBackground(Color.white);
		oKButtonPanel = new JPanel();
		oKButtonPanel.setBounds(1000, 535, 50, 50);
		oKButtonPanel.setBackground(Color.white);     
		kaKButtonPanel = new JPanel();
		kaKButtonPanel.setBounds(900, 150, 50, 50);
		kaKButtonPanel.setBackground(Color.white);
		kiKButtonPanel = new JPanel();
		kiKButtonPanel.setBounds(900, 250, 50, 50);
		kiKButtonPanel.setBackground(Color.white);
		kuKButtonPanel = new JPanel();
		kuKButtonPanel.setBounds(900, 350, 50, 50);
		kuKButtonPanel.setBackground(Color.white);
		keKButtonPanel = new JPanel();
		keKButtonPanel.setBounds(900, 440, 50, 50);
		keKButtonPanel.setBackground(Color.white);
		koKButtonPanel = new JPanel();
		koKButtonPanel.setBounds(900, 535, 50, 50);
		koKButtonPanel.setBackground(Color.white); 
		saKButtonPanel = new JPanel();
		saKButtonPanel.setBounds(800, 150, 50, 50);
		saKButtonPanel.setBackground(Color.white);
		siKButtonPanel = new JPanel();
		siKButtonPanel.setBounds(800, 250, 50, 50);
		siKButtonPanel.setBackground(Color.white);
		suKButtonPanel = new JPanel();
		suKButtonPanel.setBounds(800, 350, 50, 50);
		suKButtonPanel.setBackground(Color.white);
		seKButtonPanel = new JPanel();
		seKButtonPanel.setBounds(800, 440, 50, 50);
		seKButtonPanel.setBackground(Color.white);
		soKButtonPanel = new JPanel();
		soKButtonPanel.setBounds(800, 535, 50, 50);
		soKButtonPanel.setBackground(Color.white);
		taKButtonPanel = new JPanel();
		taKButtonPanel.setBounds(700, 150, 50, 50);
		taKButtonPanel.setBackground(Color.white);
		tiKButtonPanel = new JPanel();
		tiKButtonPanel.setBounds(700, 250, 50, 50);
		tiKButtonPanel.setBackground(Color.white);
		tuKButtonPanel = new JPanel();
		tuKButtonPanel.setBounds(700, 350, 50, 50);
		tuKButtonPanel.setBackground(Color.white);
		teKButtonPanel = new JPanel();
		teKButtonPanel.setBounds(700, 440, 50, 50);
		teKButtonPanel.setBackground(Color.white);
		toKButtonPanel = new JPanel();
		toKButtonPanel.setBounds(700, 535, 50, 50);
		toKButtonPanel.setBackground(Color.white);   
		naKButtonPanel = new JPanel();
		naKButtonPanel.setBounds(600, 150, 50, 50);
		naKButtonPanel.setBackground(Color.white);
		niKButtonPanel = new JPanel();
		niKButtonPanel.setBounds(600, 250, 50, 50);
		niKButtonPanel.setBackground(Color.white);
		nuKButtonPanel = new JPanel();
		nuKButtonPanel.setBounds(600, 350, 50, 50);
		nuKButtonPanel.setBackground(Color.white);
		neKButtonPanel = new JPanel();
		neKButtonPanel.setBounds(600, 440, 50, 50);
		neKButtonPanel.setBackground(Color.white);
		noKButtonPanel = new JPanel();
		noKButtonPanel.setBounds(600, 535, 50, 50);
		noKButtonPanel.setBackground(Color.white);   
		haKButtonPanel = new JPanel();
		haKButtonPanel.setBounds(500, 150, 50, 50);
		haKButtonPanel.setBackground(Color.white);
		hiKButtonPanel = new JPanel();
		hiKButtonPanel.setBounds(500, 250, 50, 50);
		hiKButtonPanel.setBackground(Color.white);
		huKButtonPanel = new JPanel();
		huKButtonPanel.setBounds(500, 350, 50, 50);
		huKButtonPanel.setBackground(Color.white);
		heKButtonPanel = new JPanel();
		heKButtonPanel.setBounds(500, 440, 50, 50);
		heKButtonPanel.setBackground(Color.white);
		hoKButtonPanel = new JPanel();
		hoKButtonPanel.setBounds(500, 535, 50, 50);
		hoKButtonPanel.setBackground(Color.white);  
		maKButtonPanel = new JPanel();
		maKButtonPanel.setBounds(400, 150, 50, 50);
		maKButtonPanel.setBackground(Color.white);
		miKButtonPanel = new JPanel();
		miKButtonPanel.setBounds(400, 250, 50, 50);
		miKButtonPanel.setBackground(Color.white);
		muKButtonPanel = new JPanel();
		muKButtonPanel.setBounds(400, 350, 50, 50);
		muKButtonPanel.setBackground(Color.white);
		meKButtonPanel = new JPanel();
		meKButtonPanel.setBounds(400, 440, 50, 50);
		meKButtonPanel.setBackground(Color.white);
		moKButtonPanel = new JPanel();
		moKButtonPanel.setBounds(400, 535, 50, 50);
		moKButtonPanel.setBackground(Color.white);
		yaKButtonPanel = new JPanel();
		yaKButtonPanel.setBounds(300, 150, 50, 50);
		yaKButtonPanel.setBackground(Color.white);
		yuKButtonPanel = new JPanel();
		yuKButtonPanel.setBounds(300, 350, 50, 50);
		yuKButtonPanel.setBackground(Color.white);
		yoKButtonPanel = new JPanel();
		yoKButtonPanel.setBounds(300, 535, 50, 50);
		yoKButtonPanel.setBackground(Color.white);  
		raKButtonPanel = new JPanel();
		raKButtonPanel.setBounds(200, 150, 50, 50);
		raKButtonPanel.setBackground(Color.white);
		riKButtonPanel = new JPanel();
		riKButtonPanel.setBounds(200, 250, 50, 50);
		riKButtonPanel.setBackground(Color.white);
		ruKButtonPanel = new JPanel();
		ruKButtonPanel.setBounds(200, 350, 50, 50);
		ruKButtonPanel.setBackground(Color.white);
		reKButtonPanel = new JPanel();
		reKButtonPanel.setBounds(200, 440, 50, 50);
		reKButtonPanel.setBackground(Color.white);
		roKButtonPanel = new JPanel();
		roKButtonPanel.setBounds(200, 535, 50, 50);
		roKButtonPanel.setBackground(Color.white); 
		waKButtonPanel = new JPanel();
		waKButtonPanel.setBounds(100, 150, 50, 50);
		waKButtonPanel.setBackground(Color.white);
		nKButtonPanel = new JPanel();
		nKButtonPanel.setBounds(100, 350, 50, 50);
		nKButtonPanel.setBackground(Color.white);
		woKButtonPanel = new JPanel();
		woKButtonPanel.setBounds(100, 535, 50, 50);
		woKButtonPanel.setBackground(Color.white);   
		chooseKButtonPanel = new JPanel();
		chooseKButtonPanel.setBounds(400, 0, 400, 64);
		chooseKButtonPanel.setBackground(Color.white);
		
		
		// JButton
		aKButton = new JButton("a");	
		aKButton.setBackground(Color.black);	// Color of the button
		aKButton.setForeground(Color.white);	// Color of the text of this button
		aKButton.setFont(font2);
		aKButton.addActionListener(akHandler);
		iKButton = new JButton("i");	
		iKButton.setBackground(Color.black);	// Color of the button
		iKButton.setForeground(Color.white);	// Color of the text of this button
		iKButton.setFont(font2);
		iKButton.addActionListener(ikHandler);
		uKButton = new JButton("u");	
		uKButton.setBackground(Color.black);	// Color of the button
		uKButton.setForeground(Color.white);	// Color of the text of this button
		uKButton.setFont(font2);
		uKButton.addActionListener(ukHandler);
		eKButton = new JButton("e");	
		eKButton.setBackground(Color.black);	// Color of the button
		eKButton.setForeground(Color.white);	// Color of the text of this button
		eKButton.setFont(font2);
		eKButton.addActionListener(ekHandler);
		oKButton = new JButton("o");	
		oKButton.setBackground(Color.black);	// Color of the button
		oKButton.setForeground(Color.white);	// Color of the text of this button
		oKButton.setFont(font2);
		oKButton.addActionListener(okHandler);
		kaKButton = new JButton("ka");	
		kaKButton.setBackground(Color.black);	// Color of the button
		kaKButton.setForeground(Color.white);	// Color of the text of this button
		kaKButton.setFont(font2);
		kaKButton.addActionListener(kakHandler);
		kiKButton = new JButton("ki");	
		kiKButton.setBackground(Color.black);	// Color of the button
		kiKButton.setForeground(Color.white);	// Color of the text of this button
		kiKButton.setFont(font2);
		kiKButton.addActionListener(kikHandler);
		kuKButton = new JButton("ku");	
		kuKButton.setBackground(Color.black);	// Color of the button
		kuKButton.setForeground(Color.white);	// Color of the text of this button
		kuKButton.setFont(font2);
		kuKButton.addActionListener(kukHandler);
		keKButton = new JButton("ke");	
		keKButton.setBackground(Color.black);	// Color of the button
		keKButton.setForeground(Color.white);	// Color of the text of this button
		keKButton.setFont(font2);
		keKButton.addActionListener(kekHandler);
		koKButton = new JButton("ko");	
		koKButton.setBackground(Color.black);	// Color of the button
		koKButton.setForeground(Color.white);	// Color of the text of this button
		koKButton.setFont(font2);
		koKButton.addActionListener(kokHandler);
		saKButton = new JButton("sa");	
		saKButton.setBackground(Color.black);	// Color of the button
		saKButton.setForeground(Color.white);	// Color of the text of this button
		saKButton.setFont(font2);
		saKButton.addActionListener(sakHandler);
		siKButton = new JButton("shi");	
		siKButton.setBackground(Color.black);	// Color of the button
		siKButton.setForeground(Color.white);	// Color of the text of this button
		siKButton.setFont(font2);
		siKButton.addActionListener(sikHandler);
		suKButton = new JButton("su");	
		suKButton.setBackground(Color.black);	// Color of the button
		suKButton.setForeground(Color.white);	// Color of the text of this button
		suKButton.setFont(font2);
		suKButton.addActionListener(sukHandler);
		seKButton = new JButton("se");	
		seKButton.setBackground(Color.black);	// Color of the button
		seKButton.setForeground(Color.white);	// Color of the text of this button
		seKButton.setFont(font2);
		seKButton.addActionListener(sekHandler);
		soKButton = new JButton("so");	
		soKButton.setBackground(Color.black);	// Color of the button
		soKButton.setForeground(Color.white);	// Color of the text of this button
		soKButton.setFont(font2);
		soKButton.addActionListener(sokHandler);
		taKButton = new JButton("ta");	
		taKButton.setBackground(Color.black);	// Color of the button
		taKButton.setForeground(Color.white);	// Color of the text of this button
		taKButton.setFont(font2);
		taKButton.addActionListener(takHandler);
		tiKButton = new JButton("chi");	
		tiKButton.setBackground(Color.black);	// Color of the button
		tiKButton.setForeground(Color.white);	// Color of the text of this button
		tiKButton.setFont(font2);
		tiKButton.addActionListener(tikHandler);
		tuKButton = new JButton("tsu");	
		tuKButton.setBackground(Color.black);	// Color of the button
		tuKButton.setForeground(Color.white);	// Color of the text of this button
		tuKButton.setFont(font2);
		tuKButton.addActionListener(tukHandler);
		teKButton = new JButton("te");	
		teKButton.setBackground(Color.black);	// Color of the button
		teKButton.setForeground(Color.white);	// Color of the text of this button
		teKButton.setFont(font2);
		teKButton.addActionListener(tekHandler);
		toKButton = new JButton("to");	
		toKButton.setBackground(Color.black);	// Color of the button
		toKButton.setForeground(Color.white);	// Color of the text of this button
		toKButton.setFont(font2);
		toKButton.addActionListener(tokHandler);
		naKButton = new JButton("na");	
		naKButton.setBackground(Color.black);	// Color of the button
		naKButton.setForeground(Color.white);	// Color of the text of this button
		naKButton.setFont(font2);
		naKButton.addActionListener(nakHandler);
		niKButton = new JButton("ni");	
		niKButton.setBackground(Color.black);	// Color of the button
		niKButton.setForeground(Color.white);	// Color of the text of this button
		niKButton.setFont(font2);
		niKButton.addActionListener(nikHandler);
		nuKButton = new JButton("nu");	
		nuKButton.setBackground(Color.black);	// Color of the button
		nuKButton.setForeground(Color.white);	// Color of the text of this button
		nuKButton.setFont(font2);
		nuKButton.addActionListener(nukHandler);
		neKButton = new JButton("ne");	
		neKButton.setBackground(Color.black);	// Color of the button
		neKButton.setForeground(Color.white);	// Color of the text of this button
		neKButton.setFont(font2);
		neKButton.addActionListener(nekHandler);
		noKButton = new JButton("no");	
		noKButton.setBackground(Color.black);	// Color of the button
		noKButton.setForeground(Color.white);	// Color of the text of this button
		noKButton.setFont(font2);
		noKButton.addActionListener(nokHandler);
		haKButton = new JButton("ha");	
		haKButton.setBackground(Color.black);	// Color of the button
		haKButton.setForeground(Color.white);	// Color of the text of this button
		haKButton.setFont(font2);
		haKButton.addActionListener(hakHandler);
		hiKButton = new JButton("hi");	
		hiKButton.setBackground(Color.black);	// Color of the button
		hiKButton.setForeground(Color.white);	// Color of the text of this button
		hiKButton.setFont(font2);
		hiKButton.addActionListener(hikHandler);
		huKButton = new JButton("fu");	
		huKButton.setBackground(Color.black);	// Color of the button
		huKButton.setForeground(Color.white);	// Color of the text of this button
		huKButton.setFont(font2);
		huKButton.addActionListener(hukHandler);
		heKButton = new JButton("he");	
		heKButton.setBackground(Color.black);	// Color of the button
		heKButton.setForeground(Color.white);	// Color of the text of this button
		heKButton.setFont(font2);
		heKButton.addActionListener(hekHandler);
		hoKButton = new JButton("ho");	
		hoKButton.setBackground(Color.black);	// Color of the button
		hoKButton.setForeground(Color.white);	// Color of the text of this button
		hoKButton.setFont(font2);
		hoKButton.addActionListener(hokHandler);
		maKButton = new JButton("ma");	
		maKButton.setBackground(Color.black);	// Color of the button
		maKButton.setForeground(Color.white);	// Color of the text of this button
		maKButton.setFont(font2);
		maKButton.addActionListener(makHandler);
		miKButton = new JButton("mi");	
		miKButton.setBackground(Color.black);	// Color of the button
		miKButton.setForeground(Color.white);	// Color of the text of this button
		miKButton.setFont(font2);
		miKButton.addActionListener(mikHandler);
		muKButton = new JButton("mu");	
		muKButton.setBackground(Color.black);	// Color of the button
		muKButton.setForeground(Color.white);	// Color of the text of this button
		muKButton.setFont(font2);
		muKButton.addActionListener(mukHandler);
		meKButton = new JButton("me");	
		meKButton.setBackground(Color.black);	// Color of the button
		meKButton.setForeground(Color.white);	// Color of the text of this button
		meKButton.setFont(font2);
		meKButton.addActionListener(mekHandler);
		moKButton = new JButton("mo");	
		moKButton.setBackground(Color.black);	// Color of the button
		moKButton.setForeground(Color.white);	// Color of the text of this button
		moKButton.setFont(font2);
		moKButton.addActionListener(mokHandler);
		yaKButton = new JButton("ya");	
		yaKButton.setBackground(Color.black);	// Color of the button
		yaKButton.setForeground(Color.white);	// Color of the text of this button
		yaKButton.setFont(font2);
		yaKButton.addActionListener(yakHandler);
		yuKButton = new JButton("yu");	
		yuKButton.setBackground(Color.black);	// Color of the button
		yuKButton.setForeground(Color.white);	// Color of the text of this button
		yuKButton.setFont(font2);
		yuKButton.addActionListener(yukHandler);
		yoKButton = new JButton("yo");	
		yoKButton.setBackground(Color.black);	// Color of the button
		yoKButton.setForeground(Color.white);	// Color of the text of this button
		yoKButton.setFont(font2);
		yoKButton.addActionListener(yokHandler);
		raKButton = new JButton("ra");	
		raKButton.setBackground(Color.black);	// Color of the button
		raKButton.setForeground(Color.white);	// Color of the text of this button
		raKButton.setFont(font2);
		raKButton.addActionListener(rakHandler);
		riKButton = new JButton("ri");	
		riKButton.setBackground(Color.black);	// Color of the button
		riKButton.setForeground(Color.white);	// Color of the text of this button
		riKButton.setFont(font2);
		riKButton.addActionListener(rikHandler);
		ruKButton = new JButton("ru");	
		ruKButton.setBackground(Color.black);	// Color of the button
		ruKButton.setForeground(Color.white);	// Color of the text of this button
		ruKButton.setFont(font2);
		ruKButton.addActionListener(rukHandler);
		reKButton = new JButton("re");	
		reKButton.setBackground(Color.black);	// Color of the button
		reKButton.setForeground(Color.white);	// Color of the text of this button
		reKButton.setFont(font2);
		reKButton.addActionListener(rekHandler);
		roKButton = new JButton("ro");	
		roKButton.setBackground(Color.black);	// Color of the button
		roKButton.setForeground(Color.white);	// Color of the text of this button
		roKButton.setFont(font2);
		roKButton.addActionListener(rokHandler);
		waKButton = new JButton("wa");	
		waKButton.setBackground(Color.black);	// Color of the button
		waKButton.setForeground(Color.white);	// Color of the text of this button
		waKButton.setFont(font2);
		waKButton.addActionListener(wakHandler);
		nKButton = new JButton("n");	
		nKButton.setBackground(Color.black);	// Color of the button
		nKButton.setForeground(Color.white);	// Color of the text of this button
		nKButton.setFont(font2);
		nKButton.addActionListener(nkHandler);
		woKButton = new JButton("wo");	
		woKButton.setBackground(Color.black);	// Color of the button
		woKButton.setForeground(Color.white);	// Color of the text of this button
		woKButton.setFont(font2);
		woKButton.addActionListener(wokHandler);
		chooseKButton = new JButton("Choose the characters to study");
		chooseKButton.setBackground(Color.black);
		chooseKButton.setForeground(Color.white);
		chooseKButton.setFont(font2);
		chooseKButton.addActionListener(ckHandler);


		// JTextArea
		mainTextArea = new JTextArea("");
		mainTextArea.setBounds(0, 0, 0, 0);
		mainTextArea.setBackground(Color.white);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(font);
		mainTextArea.setLineWrap(true);	// This wrap makes it so that if the text is too long
										// then it will be locked automatically, meaning it will go to the next line if necessary
		mainTextArea.setEditable(false);// This makes it so that users cannot edit the text on purpose or by accident in the gui
		
		
		// Placing the JButton on to the JPanel
		aKButtonPanel.add(aKButton);
		iKButtonPanel.add(iKButton);
		uKButtonPanel.add(uKButton);
		eKButtonPanel.add(eKButton);
		oKButtonPanel.add(oKButton);
		kaKButtonPanel.add(kaKButton);
		kiKButtonPanel.add(kiKButton);
		kuKButtonPanel.add(kuKButton);
		keKButtonPanel.add(keKButton);
		koKButtonPanel.add(koKButton);
		saKButtonPanel.add(saKButton);
		siKButtonPanel.add(siKButton);
		suKButtonPanel.add(suKButton);
		seKButtonPanel.add(seKButton);
		soKButtonPanel.add(soKButton);
		taKButtonPanel.add(taKButton);
		tiKButtonPanel.add(tiKButton);
		tuKButtonPanel.add(tuKButton);
		teKButtonPanel.add(teKButton);
		toKButtonPanel.add(toKButton);
		naKButtonPanel.add(naKButton);
		niKButtonPanel.add(niKButton);
		nuKButtonPanel.add(nuKButton);
		neKButtonPanel.add(neKButton);
		noKButtonPanel.add(noKButton);
		haKButtonPanel.add(haKButton);
		hiKButtonPanel.add(hiKButton);
		huKButtonPanel.add(huKButton);
		heKButtonPanel.add(heKButton);
		hoKButtonPanel.add(hoKButton);
		maKButtonPanel.add(maKButton);
		miKButtonPanel.add(miKButton);
		muKButtonPanel.add(muKButton);
		meKButtonPanel.add(meKButton);
		moKButtonPanel.add(moKButton);
		yaKButtonPanel.add(yaKButton);	
		yuKButtonPanel.add(yuKButton);
		yoKButtonPanel.add(yoKButton);
		raKButtonPanel.add(raKButton);
		riKButtonPanel.add(riKButton);
		ruKButtonPanel.add(ruKButton);
		reKButtonPanel.add(reKButton);
		roKButtonPanel.add(roKButton);
		waKButtonPanel.add(waKButton);
		nKButtonPanel.add(nKButton);
		woKButtonPanel.add(woKButton);
		mainTextPanel.add(mainTextArea);
		chooseKButtonPanel.add(chooseKButton);


		// Container
		con.add(aKButtonPanel);
		con.add(iKButtonPanel);
		con.add(uKButtonPanel);
		con.add(eKButtonPanel);
		con.add(oKButtonPanel);
		con.add(kaKButtonPanel);
		con.add(kiKButtonPanel);
		con.add(kuKButtonPanel);
		con.add(keKButtonPanel);
		con.add(koKButtonPanel);
		con.add(saKButtonPanel);
		con.add(siKButtonPanel);
		con.add(suKButtonPanel);
		con.add(seKButtonPanel);
		con.add(soKButtonPanel);
		con.add(taKButtonPanel);
		con.add(tiKButtonPanel);
		con.add(tuKButtonPanel);
		con.add(teKButtonPanel);
		con.add(toKButtonPanel);
		con.add(naKButtonPanel);
		con.add(niKButtonPanel);
		con.add(nuKButtonPanel);
		con.add(neKButtonPanel);
		con.add(noKButtonPanel);
		con.add(haKButtonPanel);
		con.add(hiKButtonPanel);
		con.add(huKButtonPanel);
		con.add(heKButtonPanel);
		con.add(hoKButtonPanel);
		con.add(maKButtonPanel);
		con.add(miKButtonPanel);
		con.add(muKButtonPanel);
		con.add(meKButtonPanel);
		con.add(moKButtonPanel);
		con.add(yaKButtonPanel);
		con.add(yuKButtonPanel);
		con.add(yoKButtonPanel);
		con.add(raKButtonPanel);
		con.add(riKButtonPanel);
		con.add(ruKButtonPanel);
		con.add(reKButtonPanel);
		con.add(roKButtonPanel);
		con.add(waKButtonPanel);
		con.add(nKButtonPanel);
		con.add(woKButtonPanel);
		con.add(chooseKButtonPanel);
		con.add(mainTextPanel);
		
		//JTextPane kPane = new JTextPane();	// Need the JTextPane if you want to convert unicode characters
		kPane.setText(String.valueOf("\n\n\n\n\n\u30EF"
	    		+ "              \u30E9           \u30E4"
	    		+ "             \u30CF             \u30DE"
	    		+ "               \u30CA             \u30BF"
	    		+ "             \u30B5             \u30AB             \u30A2                                     "
	    		+ "\n\n\n\n ` "
	    		+ "              \u30EA            ` "
	    		+ "             \u30DF             \u30D2"
	    		+ "               \u30CB             \u30C1"
	    		+ "             \u30B7             \u30AD             \u30A4"
	    		+ "\n\n\n\n\u30F3"
	    		+ "              \u30EB           \u30E6"
	    		+ "             \u30E0             \u30D5"
	    		+ "               \u30CC             \u30C4"
	    		+ "             \u30B9             \u30AF             \u30A6"
	    		+ "\n\n\n\n ` "
	    		+ "              \u30EC             `"
	    		+ "              \u30E1             \u30D8"
	    		+ "               \u30CD             \u30C6"
	    		+ "             \u30BB             \u30B1             \u30A8"
	    		+ "\n\n\n\n\u30F2"
	    		+ "              \u30ED           \u30E8"
	    		+ "             \u30E2             \u30DB"
	    		+ "               \u30CE             \u30C8"
	    		+ "             \u30BD             \u30B3             \u30AA"));
		kPane.setFont(font2);
		kPane.setEditable(false);
	    frame.getContentPane().add(kPane, BorderLayout.LINE_END);
	    frame.pack();            // Add these
	}
	public void addaHiragana() {
		storedChar.add("a");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addiHiragana() {
		storedChar.add("i");
		System.out.println(storedChar);
	}
	public void adduHiragana() {
		storedChar.add("u");
		System.out.println(storedChar);
	}
	public void addeHiragana() {
		storedChar.add("e");
		System.out.println(storedChar);
	}
	public void addoHiragana() {
		storedChar.add("o");
		System.out.println(storedChar);
	}
	public void addkaHiragana() {
		storedChar.add("ka");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addkiHiragana() {
		storedChar.add("ki");
		System.out.println(storedChar);
	}
	public void addkuHiragana() {
		storedChar.add("ku");
		System.out.println(storedChar);
	}
	public void addkeHiragana() {
		storedChar.add("ke");
		System.out.println(storedChar);
	}
	public void addkoHiragana() {
		storedChar.add("ko");
		System.out.println(storedChar);
	}
	public void addsaHiragana() {
		storedChar.add("sa");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addsiHiragana() {
		storedChar.add("shi");
		System.out.println(storedChar);
	}
	public void addsuHiragana() {
		storedChar.add("su");
		System.out.println(storedChar);
	}
	public void addseHiragana() {
		storedChar.add("se");
		System.out.println(storedChar);
	}
	public void addsoHiragana() {
		storedChar.add("so");
		System.out.println(storedChar);
	}
	public void addtaHiragana() {
		storedChar.add("ta");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addtiHiragana() {
		storedChar.add("chi");
		System.out.println(storedChar);
	}
	public void addtuHiragana() {
		storedChar.add("tsu");
		System.out.println(storedChar);
	}
	public void addteHiragana() {
		storedChar.add("te");
		System.out.println(storedChar);
	}
	public void addtoHiragana() {
		storedChar.add("to");
		System.out.println(storedChar);
	}
	public void addnaHiragana() {
		storedChar.add("na");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addniHiragana() {
		storedChar.add("ni");
		System.out.println(storedChar);
	}
	public void addnuHiragana() {
		storedChar.add("nu");
		System.out.println(storedChar);
	}
	public void addneHiragana() {
		storedChar.add("ne");
		System.out.println(storedChar);
	}
	public void addnoHiragana() {
		storedChar.add("no");
		System.out.println(storedChar);
	}
	public void addhaHiragana() {
		storedChar.add("ha");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addhiHiragana() {
		storedChar.add("hi");
		System.out.println(storedChar);
	}
	public void addhuHiragana() {
		storedChar.add("fu");
		System.out.println(storedChar);
	}
	public void addheHiragana() {
		storedChar.add("he");
		System.out.println(storedChar);
	}
	public void addhoHiragana() {
		storedChar.add("ho");
		System.out.println(storedChar);
	}
	public void addmaHiragana() {
		storedChar.add("ma");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addmiHiragana() {
		storedChar.add("mi");
		System.out.println(storedChar);
	}
	public void addmuHiragana() {
		storedChar.add("mu");
		System.out.println(storedChar);
	}
	public void addmeHiragana() {
		storedChar.add("me");
		System.out.println(storedChar);
	}
	public void addmoHiragana() {
		storedChar.add("mo");
		System.out.println(storedChar);
	}
	public void addyaHiragana() {
		storedChar.add("ya");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addyuHiragana() {
		storedChar.add("yu");
		System.out.println(storedChar);
	}
	public void addyoHiragana() {
		storedChar.add("yo");
		System.out.println(storedChar);
	}
	public void addraHiragana() {
		storedChar.add("ra");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addriHiragana() {
		storedChar.add("ri");
		System.out.println(storedChar);
	}
	public void addruHiragana() {
		storedChar.add("ru");
		System.out.println(storedChar);
	}
	public void addreHiragana() {
		storedChar.add("re");
		System.out.println(storedChar);
	}
	public void addroHiragana() {
		storedChar.add("ro");
		System.out.println(storedChar);
	}
	public void addwaHiragana() {
		storedChar.add("wa");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addnHiragana() {
		storedChar.add("n");
		System.out.println(storedChar);
	}
	public void addwoHiragana() {
		storedChar.add("wo");
		System.out.println(storedChar);
	}
	/**********************************************************************************************************************
	 * This is for the Katakana 
	 **********************************************************************************************************************/
	public void addaKatakana() {
		storedChar.add("a");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addiKatakana() {
		storedChar.add("i");
		System.out.println(storedChar);
	}
	public void adduKatakana() {
		storedChar.add("u");
		System.out.println(storedChar);
	}
	public void addeKatakana() {
		storedChar.add("e");
		System.out.println(storedChar);
	}
	public void addoKatakana() {
		storedChar.add("o");
		System.out.println(storedChar);
	}
	public void addkaKatakana() {
		storedChar.add("ka");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addkiKatakana() {
		storedChar.add("ki");
		System.out.println(storedChar);
	}
	public void addkuKatakana() {
		storedChar.add("ku");
		System.out.println(storedChar);
	}
	public void addkeKatakana() {
		storedChar.add("ke");
		System.out.println(storedChar);
	}
	public void addkoKatakana() {
		storedChar.add("ko");
		System.out.println(storedChar);
	}
	public void addsaKatakana() {
		storedChar.add("sa");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addsiKatakana() {
		storedChar.add("shi");
		System.out.println(storedChar);
	}
	public void addsuKatakana() {
		storedChar.add("su");
		System.out.println(storedChar);
	}
	public void addseKatakana() {
		storedChar.add("se");
		System.out.println(storedChar);
	}
	public void addsoKatakana() {
		storedChar.add("so");
		System.out.println(storedChar);
	}
	public void addtaKatakana() {
		storedChar.add("ta");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addtiKatakana() {
		storedChar.add("chi");
		System.out.println(storedChar);
	}
	public void addtuKatakana() {
		storedChar.add("tsu");
		System.out.println(storedChar);
	}
	public void addteKatakana() {
		storedChar.add("te");
		System.out.println(storedChar);
	}
	public void addtoKatakana() {
		storedChar.add("to");
		System.out.println(storedChar);
	}
	public void addnaKatakana() {
		storedChar.add("na");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addniKatakana() {
		storedChar.add("ni");
		System.out.println(storedChar);
	}
	public void addnuKatakana() {
		storedChar.add("nu");
		System.out.println(storedChar);
	}
	public void addneKatakana() {
		storedChar.add("ne");
		System.out.println(storedChar);
	}
	public void addnoKatakana() {
		storedChar.add("no");
		System.out.println(storedChar);
	}
	public void addhaKatakana() {
		storedChar.add("ha");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addhiKatakana() {
		storedChar.add("hi");
		System.out.println(storedChar);
	}
	public void addhuKatakana() {
		storedChar.add("fu");
		System.out.println(storedChar);
	}
	public void addheKatakana() {
		storedChar.add("he");
		System.out.println(storedChar);
	}
	public void addhoKatakana() {
		storedChar.add("ho");
		System.out.println(storedChar);
	}
	public void addmaKatakana() {
		storedChar.add("ma");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addmiKatakana() {
		storedChar.add("mi");
		System.out.println(storedChar);
	}
	public void addmuKatakana() {
		storedChar.add("mu");
		System.out.println(storedChar);
	}
	public void addmeKatakana() {
		storedChar.add("me");
		System.out.println(storedChar);
	}
	public void addmoKatakana() {
		storedChar.add("mo");
		System.out.println(storedChar);
	}
	public void addyaKatakana() {
		storedChar.add("ya");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addyuKatakana() {
		storedChar.add("yu");
		System.out.println(storedChar);
	}
	public void addyoKatakana() {
		storedChar.add("yo");
		System.out.println(storedChar);
	}
	public void addraKatakana() {
		storedChar.add("ra");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addriKatakana() {
		storedChar.add("ri");
		System.out.println(storedChar);
	}
	public void addruKatakana() {
		storedChar.add("ru");
		System.out.println(storedChar);
	}
	public void addreKatakana() {
		storedChar.add("re");
		System.out.println(storedChar);
	}
	public void addroKatakana() {
		storedChar.add("ro");
		System.out.println(storedChar);
	}
	public void addwaKatakana() {
		storedChar.add("wa");
		System.out.println(storedChar);	// This is just so I can see what's going on inside the program using the console
	}
	public void addnKatakana() {
		storedChar.add("n");
		System.out.println(storedChar);
	}
	public void addwoKatakana() {
		storedChar.add("wo");
		System.out.println(storedChar);
	}
	
	public void createStudyHScreen() {
		// get input from the user then compare it in the array list and see if it is correct
		// if it is correct, then  give 1 point to the user
		//	 
		//	System.out.println(char);
		// if(storedChar == Ç† || storedChar == ÉA){
		//	correct++; 
		//
		//}
		aHButtonPanel.setVisible(false);
		iHButtonPanel.setVisible(false);
		uHButtonPanel.setVisible(false);
		eHButtonPanel.setVisible(false);
		oHButtonPanel.setVisible(false);
		kaHButtonPanel.setVisible(false);
		kiHButtonPanel.setVisible(false);
		kuHButtonPanel.setVisible(false);
		keHButtonPanel.setVisible(false);
		koHButtonPanel.setVisible(false);
		saHButtonPanel.setVisible(false);
		siHButtonPanel.setVisible(false);
		suHButtonPanel.setVisible(false);
		seHButtonPanel.setVisible(false);
		soHButtonPanel.setVisible(false);
		taHButtonPanel.setVisible(false);
		tiHButtonPanel.setVisible(false);
		tuHButtonPanel.setVisible(false);
		teHButtonPanel.setVisible(false);
		toHButtonPanel.setVisible(false);
		naHButtonPanel.setVisible(false);
		niHButtonPanel.setVisible(false);
		nuHButtonPanel.setVisible(false);
		neHButtonPanel.setVisible(false);
		noHButtonPanel.setVisible(false);
		haHButtonPanel.setVisible(false);
		hiHButtonPanel.setVisible(false);
		huHButtonPanel.setVisible(false);
		heHButtonPanel.setVisible(false);
		hoHButtonPanel.setVisible(false);
		maHButtonPanel.setVisible(false);
		miHButtonPanel.setVisible(false);
		muHButtonPanel.setVisible(false);
		meHButtonPanel.setVisible(false);
		moHButtonPanel.setVisible(false);
		yaHButtonPanel.setVisible(false);
		yuHButtonPanel.setVisible(false);
		yoHButtonPanel.setVisible(false);
		raHButtonPanel.setVisible(false);
		riHButtonPanel.setVisible(false);
		ruHButtonPanel.setVisible(false);
		reHButtonPanel.setVisible(false);
		roHButtonPanel.setVisible(false);
		waHButtonPanel.setVisible(false);
		nHButtonPanel.setVisible(false);
		woHButtonPanel.setVisible(false);
		mainTextPanel.setVisible(false);
		chooseHButtonPanel.setVisible(false);
		frame.remove(hPane);
		correctLabel = new JLabel("Your score is ");
		correctLabel.setBounds(600, 100, 100, 50);
		countLabel = new JLabel();
		countLabel.setBounds(650, 110, 100, 50);
		
//		hPane.setText(String.valueOf("\n\n\n\n\n\u308F"
//	    		+ "              \u3089           \u3084"
//	    		+ "             \u307E             \u306F"
//	    		+ "               \u306A             \u305F"
//	    		+ "             \u3055             \u304B             \u3042                                     "
//	    		+ "\n\n\n\n ` "
//	    		+ "              \u308A            ` "
//	    		+ "             \u307F             \u3072"
//	    		+ "               \u306B             \u3061"
//	    		+ "             \u3057             \u304D             \u3044"
//	    		+ "\n\n\n\n\u3093"
//	    		+ "              \u308B           \u3086"
//	    		+ "             \u3080             \u3075"
//	    		+ "               \u306C             \u3064"
//	    		+ "             \u3059             \u304F             \u3046"
//	    		+ "\n\n\n\n ` "
//	    		+ "              \u308C             `"
//	    		+ "              \u3081             \u3078"
//	    		+ "               \u306D             \u3066"
//	    		+ "             \u305B             \u3051             \u3048"
//	    		+ "\n\n\n\n\u3092"
//	    		+ "              \u308D           \u3088"
//	    		+ "             \u3082             \u307B"
//	    		+ "               \u306E             \u3068"
//	    		+ "             \u305D             \u3053             \u304A"));
//		hPane.setFont(font2);
//		hPane.setEditable(false);
//	    frame.getContentPane().add(hPane, BorderLayout.LINE_END);
//	    frame.pack();            // Add these
		JPanel userInputPanel = new JPanel();
		JTextField textField = new JTextField("Press Enter to begin", 30);
		userInputPanel.add(textField);
		
		Collections.shuffle(storedChar);
		
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String input = textField.getText();
					String temp = storedChar.get(0);
					if(input.equals(temp)) {
						correct++;
						count++;
						correctLabel.setText("Your score is " + correct);
						countLabel.setText("out of " + count);
						textField.setText(null);
						storedChar.remove(0);
					}else{
						count++;
						correctLabel.setText("Your score is " + correct);
						countLabel.setText("out of " + count);
						textField.setText(null);
					}
					if(storedChar.get(0).equals("a")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3042"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ka")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u304B"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("sa")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3055"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ta")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u305F"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("na")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306A"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ha")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306F"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ma")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u307E"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ya")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3084"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ra")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3089"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("wa")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u308F"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("i")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3044"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ki")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u304D"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("shi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3057"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("chi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3061"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ni")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306B"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("hi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3072"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u307F"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ri")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u308A"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("u")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3046"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ku")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u304F"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("su")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3059"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("tsu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3064"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("nu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306C"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("fu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3075"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3080"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("yu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3086"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ru")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u308B"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("n")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3093"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("e")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3048"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ke")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3051"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("se")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u305B"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("te")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3066"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ne")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306D"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("he")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3078"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("me")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3081"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("re")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u308C"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("o")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u304A"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ko")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3053"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("so")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u305D"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("to")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3068"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("no")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u306E"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ho")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u307B"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3082"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("yo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3088"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ro")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u308D"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("wo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u3092"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }
			}
		});
		frame.add(correctLabel);
		frame.add(countLabel);
		frame.add(userInputPanel);	
	}
	
	public void createStudyKScreen() {
		// get input from the user then compare it in the array list and see if it is correct
		// if it is correct, then  give 1 point to the user
		//	 
		//	System.out.println(char);
		// if(storedChar == Ç† || storedChar == ÉA){
		//	correct++; 
		//
		//}
		aKButtonPanel.setVisible(false);
		iKButtonPanel.setVisible(false);
		uKButtonPanel.setVisible(false);
		eKButtonPanel.setVisible(false);
		oKButtonPanel.setVisible(false);
		kaKButtonPanel.setVisible(false);
		kiKButtonPanel.setVisible(false);
		kuKButtonPanel.setVisible(false);
		keKButtonPanel.setVisible(false);
		koKButtonPanel.setVisible(false);
		saKButtonPanel.setVisible(false);
		siKButtonPanel.setVisible(false);
		suKButtonPanel.setVisible(false);
		seKButtonPanel.setVisible(false);
		soKButtonPanel.setVisible(false);
		taKButtonPanel.setVisible(false);
		tiKButtonPanel.setVisible(false);
		tuKButtonPanel.setVisible(false);
		teKButtonPanel.setVisible(false);
		toKButtonPanel.setVisible(false);
		naKButtonPanel.setVisible(false);
		niKButtonPanel.setVisible(false);
		nuKButtonPanel.setVisible(false);
		neKButtonPanel.setVisible(false);
		noKButtonPanel.setVisible(false);
		haKButtonPanel.setVisible(false);
		hiKButtonPanel.setVisible(false);
		huKButtonPanel.setVisible(false);
		heKButtonPanel.setVisible(false);
		hoKButtonPanel.setVisible(false);
		maKButtonPanel.setVisible(false);
		miKButtonPanel.setVisible(false);
		muKButtonPanel.setVisible(false);
		meKButtonPanel.setVisible(false);
		moKButtonPanel.setVisible(false);
		yaKButtonPanel.setVisible(false);
		yuKButtonPanel.setVisible(false);
		yoKButtonPanel.setVisible(false);
		raKButtonPanel.setVisible(false);
		riKButtonPanel.setVisible(false);
		ruKButtonPanel.setVisible(false);
		reKButtonPanel.setVisible(false);
		roKButtonPanel.setVisible(false);
		waKButtonPanel.setVisible(false);
		nKButtonPanel.setVisible(false);
		woKButtonPanel.setVisible(false);
		mainTextPanel.setVisible(false);
		chooseKButtonPanel.setVisible(false);
		frame.remove(kPane);
		correctLabel = new JLabel("Your score is ");
		correctLabel.setBounds(600, 100, 100, 50);
		countLabel = new JLabel();
		countLabel.setBounds(650, 110, 100, 50);
		
//		hPane.setText(String.valueOf("\n\n\n\n\n\u308F"
//	    		+ "              \u3089           \u3084"
//	    		+ "             \u307E             \u306F"
//	    		+ "               \u306A             \u305F"
//	    		+ "             \u3055             \u304B             \u3042                                     "
//	    		+ "\n\n\n\n ` "
//	    		+ "              \u308A            ` "
//	    		+ "             \u307F             \u3072"
//	    		+ "               \u306B             \u3061"
//	    		+ "             \u3057             \u304D             \u3044"
//	    		+ "\n\n\n\n\u3093"
//	    		+ "              \u308B           \u3086"
//	    		+ "             \u3080             \u3075"
//	    		+ "               \u306C             \u3064"
//	    		+ "             \u3059             \u304F             \u3046"
//	    		+ "\n\n\n\n ` "
//	    		+ "              \u308C             `"
//	    		+ "              \u3081             \u3078"
//	    		+ "               \u306D             \u3066"
//	    		+ "             \u305B             \u3051             \u3048"
//	    		+ "\n\n\n\n\u3092"
//	    		+ "              \u308D           \u3088"
//	    		+ "             \u3082             \u307B"
//	    		+ "               \u306E             \u3068"
//	    		+ "             \u305D             \u3053             \u304A"));
//		hPane.setFont(font2);
//		hPane.setEditable(false);
//	    frame.getContentPane().add(hPane, BorderLayout.LINE_END);
//	    frame.pack();            // Add these
		JPanel userInputPanel = new JPanel();
		JTextField textField = new JTextField("Press Enter to begin", 20);
		userInputPanel.add(textField);
		
		Collections.shuffle(storedChar);
		
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String input = textField.getText();
					String temp = storedChar.get(0);
					if(input.equals(temp)) {
						correct++;
						count++;
						correctLabel.setText("Your score is " + correct);
						countLabel.setText("out of " + count);
						textField.setText(null);
						storedChar.remove(0);
					}else{
						count++;
						correctLabel.setText("Your score is " + correct);
						countLabel.setText("out of " + count);
						textField.setText(null);
					}
					if(storedChar.get(0).equals("a")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30A2"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ka")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30AB"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("sa")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30B5"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ta")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30BF"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("na")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CA"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ha")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CF"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ma")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30DE"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ya")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E4"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ra")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E9"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("wa")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30EF"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("i")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30A4"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ki")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30AD"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("shi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30B7"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("chi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30C1"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ni")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CB"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("hi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30D2"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mi")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30DF"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ri")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30EA"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("u")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30A6"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ku")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30AF"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("su")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30B9"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("tsu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30C4"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("nu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CC"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("fu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30D5"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E0"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("yu")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E6"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ru")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30EB"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("n")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30F3"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("e")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30A8"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ke")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30B1"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("se")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30BB"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("te")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30C6"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ne")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CD"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("he")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30D8"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("me")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E1"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("re")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30EC"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("o")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30AA"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ko")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30B3"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("so")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30BD"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("to")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30C8"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("no")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30CE"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ho")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30DB"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("mo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E2"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("yo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30E8"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("ro")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30ED"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }else if(storedChar.get(0).equals("wo")) {
				    	hPane.setText(String.valueOf("\t\t\t\t\t\t\t\t\u30F2"));
				    	hPane.setFont(font2);
				    	frame.getContentPane().add(hPane, BorderLayout.NORTH);
				    	frame.pack();
				    }
			}
		});
		frame.add(correctLabel);
		frame.add(countLabel);
		frame.add(userInputPanel);	
	}
/*************************************************************************************************************************
 *  The follow is a handler that implements ActionListener, so that whenever the user clicks on one of the buttons, then
 *  it changes the screen
 * @author Kevin
 *
 **************************************************************************************************************************/
	public class BackPlayScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			backPlayButtonPanel.setVisible(false);
			KatakanaButtonPanel.setVisible(false);
			HiraganaButtonPanel.setVisible(false);
			mainTextPanel.setVisible(false);
			playLabel.setIcon(null);

			playButtonPanel.setVisible(true);
			helpButtonPanel.setVisible(true);
			quitButtonPanel.setVisible(true);
			menuLabel.setIcon(iconMenu);

			con.add(menuLabel);
		}

	}

	public class BackHelpScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			backHelpButtonPanel.setVisible(false);
//			mainTextPanel.setVisible(false);
			textPane.setVisible(false);
			helpLabel.setIcon(null);
			

			playButtonPanel.setVisible(true);
			helpButtonPanel.setVisible(true);
			quitButtonPanel.setVisible(true);
			menuLabel.setIcon(iconMenu);

			con.add(menuLabel);
		}

	}
	/**********************************************************************************
	 * Adding all the hiragana characters into an arraylist
	 * 
	 * 
	 **********************************************************************************/
	public class aHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addaHiragana();
		}
	}
	public class iHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addiHiragana();
		}
	}
	public class uHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			adduHiragana();
		}
	}
	public class eHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addeHiragana();
		}
	}
	public class oHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addoHiragana();
		}
	}
	public class kaHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkaHiragana();
		}
	}
	public class kiHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkiHiragana();
		}
	}
	public class kuHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkuHiragana();
		}
	}
	public class keHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkeHiragana();
		}
	}
	public class koHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkoHiragana();
		}
	}
	public class saHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsaHiragana();
		}
	}
	public class siHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsiHiragana();
		}
	}
	public class suHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsuHiragana();
		}
	}
	public class seHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addseHiragana();
		}
	}
	public class soHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsoHiragana();
		}
	}
	public class taHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtaHiragana();
		}
	}
	public class tiHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtiHiragana();
		}
	}
	public class tuHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtuHiragana();
		}
	}
	public class teHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addteHiragana();
		}
	}
	public class toHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtoHiragana();
		}
	}
	public class naHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnaHiragana();
		}
	}
	public class niHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addniHiragana();
		}
	}
	public class nuHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnuHiragana();
		}
	}
	public class neHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addneHiragana();
		}
	}
	public class noHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnoHiragana();
		}
	}
	public class haHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhaHiragana();
		}
	}
	public class hiHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhiHiragana();
		}
	}
	public class huHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhuHiragana();
		}
	}
	public class heHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addheHiragana();
		}
	}
	public class hoHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhoHiragana();
		}
	}
	public class maHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmaHiragana();
		}
	}
	public class miHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmiHiragana();
		}
	}
	public class muHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmuHiragana();
		}
	}
	public class meHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmeHiragana();
		}
	}
	public class moHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmoHiragana();
		}
	}
	public class yaHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyaHiragana();
		}
	}
	public class yuHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyuHiragana();
		}
	}
	public class yoHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyoHiragana();
		}
	}
	public class raHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addraHiragana();
		}
	}
	public class riHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addriHiragana();
		}
	}
	public class ruHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addruHiragana();
		}
	}
	public class reHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addreHiragana();
		}
	}
	public class roHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addroHiragana();
		}
	}
	public class waHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addwaHiragana();
		}
	}
	public class nHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnHiragana();
		}
	}
	public class woHHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addwoHiragana();
		}
	}
	/**********************************************************************************
	 * Adding all the katakana characters into an arraylist
	 * 
	 * 
	 **********************************************************************************/
	public class aKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addaKatakana();
		}
	}
	public class iKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addiKatakana();
		}
	}
	public class uKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			adduKatakana();
		}
	}
	public class eKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addeKatakana();
		}
	}
	public class oKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addoKatakana();
		}
	}
	public class kaKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkaKatakana();
		}
	}
	public class kiKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkiKatakana();
		}
	}
	public class kuKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkuKatakana();
		}
	}
	public class keKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkeKatakana();
		}
	}
	public class koKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addkoKatakana();
		}
	}
	public class saKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsaKatakana();
		}
	}
	public class siKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsiKatakana();
		}
	}
	public class suKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsuKatakana();
		}
	}
	public class seKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addseKatakana();
		}
	}
	public class soKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addsoKatakana();
		}
	}
	public class taKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtaKatakana();
		}
	}
	public class tiKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtiKatakana();
		}
	}
	public class tuKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtuKatakana();
		}
	}
	public class teKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addteKatakana();
		}
	}
	public class toKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addtoKatakana();
		}
	}
	public class naKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnaKatakana();
		}
	}
	public class niKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addniKatakana();
		}
	}
	public class nuKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnuKatakana();
		}
	}
	public class neKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addneKatakana();
		}
	}
	public class noKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnoKatakana();
		}
	}
	public class haKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhaKatakana();
		}
	}
	public class hiKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhiKatakana();
		}
	}
	public class huKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhuKatakana();
		}
	}
	public class heKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addheKatakana();
		}
	}
	public class hoKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addhoKatakana();
		}
	}
	public class maKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmaKatakana();
		}
	}
	public class miKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmiKatakana();
		}
	}
	public class muKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmuKatakana();
		}
	}
	public class meKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmeKatakana();
		}
	}
	public class moKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addmoKatakana();
		}
	}
	public class yaKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyaKatakana();
		}
	}
	public class yuKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyuKatakana();
		}
	}
	public class yoKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addyoKatakana();
		}
	}
	public class raKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addraKatakana();
		}
	}
	public class riKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addriKatakana();
		}
	}
	public class ruKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addruKatakana();
		}
	}
	public class reKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addreKatakana();
		}
	}
	public class roKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addroKatakana();
		}
	}
	public class waKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addwaKatakana();
		}
	}
	public class nKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addnKatakana();
		}
	}
	public class woKHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			addwoKatakana();
		}
	}
	public class chooseHiraganaHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			createStudyHScreen();
		}
	}
	public class chooseKatakanaHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			createStudyKScreen();
		}	
	}

	public class PlayScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			createPlayScreen();
		}
	}
	public class HelpScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			createHelpScreen();
		}
	}
	public class QuitScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(1);
		}	
	}
	public class HCScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			createHCharacterScreen();
		}
		
	}
	public class KCScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			createKCharacterScreen();
		}
	}

	public static void main(String args[]) {
		new Game(); // creates a new instance in our game class, which will call
					// the constructor
		
	}
}
