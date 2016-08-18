package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import video.DVDPlayer;

//@Configuration
//@ComponentScan(basePackages={"video","soundsystem"})//ɨ���
//@ComponentScan(basePackageClasses={CDPlayer.class , DVDPlayer.class})//ɨ�������ڵİ�
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
//		return new CDPlayer(randomWestLifeCD());//��������ᱻ����
//	}
	
//	@Bean
//	public CDPlayer cdPlay(CompactDisc compactDisc){
//		//�Զ�ע��
//		return new CDPlayer(randomWestLifeCD());
//	}
	
}
