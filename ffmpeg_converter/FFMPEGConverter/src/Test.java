import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;

import java.io.File;

//参考文档网址
//http://tj007-bo.iteye.com/blog/435740

//test
//http://www.sauronsoftware.it/projects/jave/index.php


public class Test {

	public static void main(String[] args) throws Exception 
	{
		File source = new File("source.wav");
		File target = new File("target.mp3");
		
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		
		//audio.setBitRate(new Integer(128000));
		audio.setBitRate(new Integer(128000));
		
		//audio.setChannels(new Integer(2));
		audio.setChannels(new Integer(1));
		
		//audio.setSamplingRate(new Integer(44100));
		audio.setSamplingRate(new Integer(44100));
		
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp3");
		
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		
		encoder.encode(source, target, attrs);
	}
	
	
	
}
