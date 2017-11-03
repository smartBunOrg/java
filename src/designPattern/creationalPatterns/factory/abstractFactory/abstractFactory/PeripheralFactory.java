package designPattern.creationalPatterns.factory.abstractFactory.abstractFactory;

import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.InputAble;
import designPattern.creationalPatterns.factory.abstractFactory.abstractProduct.OutputAble;

public abstract class PeripheralFactory {
	public abstract InputAble createMouse();
	public abstract InputAble createKeyboard();
	public abstract OutputAble createVoiceBox();
	public abstract OutputAble createDisplay();
}
