package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import video.DVDPlayer;

@Configuration
//@ComponentScan(basePackages={"video","soundsystem"})//ɨ���
@ComponentScan(basePackageClasses={CDPlayer.class , DVDPlayer.class})//ɨ�������ڵİ�
public class CDplayerConfig {

}
