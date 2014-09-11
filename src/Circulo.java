
public class Circulo {

	private double radio;
	
	Circulo (double radio)
	{
		this.radio = radio;
	}
	
	double getRadio()
	{
		return radio;
	}
	
	void setRadio ( double radio)
	{
		this.radio = radio;
	}
	
	double getPerimetro ()
	{
		return (2 * 3.1416)*radio;
	}
	
	double getArea ()
	{
		return 3.1416*(radio*radio);
	}
}
