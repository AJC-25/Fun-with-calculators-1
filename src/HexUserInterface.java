import java.awt.event.ActionEvent;

public class HexUserInterface extends UserInterface{
	public HexUserInterface(CalcEngine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	int decimal = calc.getDisplayValue();

    /**
     * get actionPerformed from super
     */
    public void actionPerformed(ActionEvent event){
        super.redisplay();
    }
    /**
     * convert decimal result into hexadecimal number
     */
    protected void convertDecimalToHexa(){
        //convert to hexa
        // int quotient = decimal / 16;
        // int rest = decimal % 16;
        // while(quotient != 0){
            // quotient = quotient/16;
            // rest = quotient%16;
        // }
        String hexa = Integer.toHexString(decimal);
        
    }
    
}
