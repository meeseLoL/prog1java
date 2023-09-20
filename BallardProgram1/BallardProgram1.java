class BallardProgram1
{
	public void start()
	{
		// tiny circle in middle
		ct.circle (50, 50, .5);
		
		// blue Rectangle top
		ct.rect(50, 10, 60, 5, "blue");

		// line IS YELLOOOOWW
		ct.line(10, 30, 30, 40, "yellow");

		//Text
		ct.text("Program1", 50, 10, 5, "green");

		//image
		ct.image("Scorpion.png", 70, 50, 30);

		// text print
		ct.print("Welcome to Program1");
		
		// print line
		ct.println(" Finish Him!");
		
		/*
		This is my block comment
		below the block comment I will be adding things such as
		ct.showAlert()
		ct.setTitle()
		ct.setHeight()
		ct.setBackColorRGB()
		and other various function calls
		and add them in to program1!
		*/

		// Alert "click ok"
		ct.showAlert("End");

		// Pro....Gram...Sports.... It's number 1!
		ct.setTitle("Pro... Gram... Sports... it's Number 1");

		// Height
		ct.setHeight(100);
		
		//BackColor after closing alert
		ct.setBackColor("green");

		// Enter The Matrix
		ct.setBackImage("3HeZ.gif");

		// the sound "bye rap game"
		ct.sound("bye rap game.mp3");

		// what is pause?
		ct.pause();
	}
}
