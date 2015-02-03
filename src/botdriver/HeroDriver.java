package botdriver;

import org.openqa.selenium.WebDriver;

import taskstructure.CheckAdventuresTask;
import taskstructure.TaskQueue;

public class HeroDriver extends Thread{
	WebDriver driver;
	
	public HeroDriver(WebDriver dv){
		this.driver = dv;
	}
	public void run(){
		while(true){
			TaskQueue.push(new CheckAdventuresTask(driver, this));
			try {
				Thread.sleep(120 * 60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
