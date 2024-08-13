package com.practice.Multithreading;

//the volatile keyword is used in multithreading to indicate that a variable's value will be
//modified by different threads. It ensures visibility of changes to variables across threads.

public class VolatileExample
{
	private volatile boolean flag = false;

	public void setFlag(boolean value)
	{
		flag = value;
	}

	public boolean getFlag()
	{
		return flag;
	}

	public static void main(String[] args)
	{
		VolatileExample example = new VolatileExample();

		// Thread to set the flag to true
		Thread writerThread = new Thread(
			() -> {
				try
				{
					Thread.sleep(1000); // Simulate some work
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				example.setFlag(true);
				System.out.println("Flag set to true");
			});

		// Thread to read the flag
		Thread readerThread = new Thread(
			() -> {
				while (!example.getFlag())
				{
					// Busy-wait until flag is set to true
				}
				System.out.println("Flag is " + example.getFlag());
			});

		writerThread.start();
		readerThread.start();
	}
}
