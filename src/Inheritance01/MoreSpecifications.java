//******************************************************
// MoreSpecifications.java   Author: Nazmul Hasan
// Demonstrates how to use inheritance method.
//******************************************************

package Inheritance01;

class Laptop {
	
	String Brand = "Hewlett-Packard (HP)";
	String Model = "EliteBook x360 1020 G2";
	
	public void does (){
		
		System.out.println("HP Laptop Information");
	
	}

}

class Specifications extends Laptop {
	
	String OperatingSystem= "Windows 10 Pro 64";
	String ProcessorFamily= "7th Generation Intel Core i5 processor";
	String  Processor = "Intel Core i5-7200U with Intel HD Graphics 620 (2.5 GHz, up to 3.1 GHz with Intel Turbo Boost Technology, 3 MB cache, 2 cores)";
	String  Memory = "8 GB LPDDR3-1866 SDRAM";
	String  InternalDrive = "128 GB M.2 SATA TLC SSD";
	String  Graphics = "Intel HD Graphics 620";
	
	public void does (){
		
		System.out.println("HP Sure View Integrated Privacy Screen 12.5 inch diagonal FHD IPS eDP LED-backlit touch screen with Corning Gorilla Glass 4, 700 cd/m2, 100% sRGB (1920 x 1080) [11,13,30]");

	}

}

public class MoreSpecifications extends Specifications {
	String  Audio = "Audio by Bang & Olufsen; Digital dual-array microphone; Premium stereo speakers";
	String  WirelessTechnology = "Intel Dual Band Wireless-AC 8265 802.11a/b/g/n/ac (2x2) WiFi and Bluetooth 4.2 Combo (non-vPro)";
	String  Webcam = "720p HD webcam, IR camera for face authentication with Windows Hello";
	String  Battery = "4-cell, long life 49.28 Wh Li-ion";
	String  Dimensions = "(W X D X H) 11.41 x 8.02 x 0.53 in";
	
	public static void main(String[] args) {
		
		MoreSpecifications obj = new MoreSpecifications();
		
		System.out.println(obj.Brand);
		System.out.println(obj.Model);
		System.out.println(obj.OperatingSystem);
		System.out.println(obj.ProcessorFamily);
		System.out.println(obj.Processor);
		System.out.println(obj.Memory);
		System.out.println(obj.InternalDrive);
		System.out.println(obj.Graphics);
		System.out.println(obj.Audio);
		System.out.println(obj.WirelessTechnology);
		System.out.println(obj.Webcam);
		System.out.println(obj.Battery);
		System.out.println(obj.Dimensions);
		
		obj.does();
	
	}

}