package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import video.DVDPlayer;

@Configuration
//@ComponentScan(basePackages={"video","soundsystem"})//扫描包
@ComponentScan(basePackageClasses={CDPlayer.class , DVDPlayer.class})//扫描类所在的包
public class CDplayerConfig {

}
