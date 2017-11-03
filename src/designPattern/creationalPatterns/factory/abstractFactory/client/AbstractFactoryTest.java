package designPattern.creationalPatterns.factory.abstractFactory.client;

import designPattern.creationalPatterns.factory.abstractFactory.abstractFactory.PeripheralFactory;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;
import designPattern.creationalPatterns.factory.abstractFactory.concreteFactory.ConcreteFactory1;
import designPattern.creationalPatterns.factory.abstractFactory.concreteFactory.ConcreteFactory2;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		PeripheralFactory peripheralFactory;
		System.out.println("====================================================");
		System.out.println("Get peripherals from ConcreteFactory1");
		peripheralFactory = ConcreteFactory1.getInstance();
		InputAble keyboard1 = peripheralFactory.createKeyboard();
		InputAble mouse1 = peripheralFactory.createMouse();
		OutputAble display1 = peripheralFactory.createDisplay();
		OutputAble voiceBox1 = peripheralFactory.createVoiceBox();
		keyboard1.input();
		mouse1.input();
		display1.output();
		voiceBox1.output();
		
		System.out.println("====================================================");
		System.out.println("Get peripherals from ConcreteFactory2");
		peripheralFactory = ConcreteFactory2.getInstance();
		InputAble keyboard2 = peripheralFactory.createKeyboard();
		InputAble mouse2 = peripheralFactory.createMouse();
		OutputAble display2 = peripheralFactory.createDisplay();
		OutputAble voiceBox2 = peripheralFactory.createVoiceBox();
		keyboard2.input();
		mouse2.input();
		display2.output();
		voiceBox2.output();
	}
}
