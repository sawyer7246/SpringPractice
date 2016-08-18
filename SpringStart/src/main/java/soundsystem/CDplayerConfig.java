package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import video.DVDPlayer;

//@Configuration
//@ComponentScan(basePackages={"video","soundsystem"})//扫描包
//@ComponentScan(basePackageClasses={CDPlayer.class , DVDPlayer.class})//扫描类所在的包
public class CDplayerConfig {

	@Bean
	public CompactDisc randomWestLifeCD(){
		int choice = (int)Math.floor(Math.random()*2);
		if(choice == 0 ){
			return new  WestLifeAlbum();
		}else{
			return new RadioHead();
		}
	}
	
//	@Bean
//	public CDPlayer cdPlay(){
//		return new CDPlayer(randomWestLifeCD());//这个方法会被拦截
//	}
	
//	@Bean
//	public CDPlayer cdPlay(CompactDisc compactDisc){
//		//自动注入
//		return new CDPlayer(randomWestLifeCD());
//	}
	
}
