package converter_import;

public class ConverterMain {
	
	public static void main(String[] args){
		
		if (args.length!=3){
			System.out.println("numero di argomenti invalido");
			return;
		}
		double lengthValue = Double.parseDouble(args[0]);
		Lengths fromLengthUnit = Lengths.valueOf(args[1]);
		Lengths toLengthUnit = Lengths.valueOf(args[2]);
		
		LengthUnit l = new LengthUnit();
		LengthUnitSoap port = l.getLengthUnitSoap();
		double converted = port.changeLengthUnit(lengthValue, fromLengthUnit, toLengthUnit);
		System.out.println(converted);
		
	}

}
