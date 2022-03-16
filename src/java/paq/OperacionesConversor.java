package paq;

//@author Nigth Crawler

public class OperacionesConversor {
    
    
    public String aMoneda (double cantidad, String moneda){
        
        return " "+Math.round(cantidad*100.0)/100.0;
    }
    public double convertirMoneda (double cantidad, String currencyIn, String currencyOut){
        double conversion = 0;
        switch (currencyIn){
            case "EUR":
                
                if(currencyOut.equals("USD")){
                    conversion=cantidad*1.16;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 23.59;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 4194.70;                
                }else{
                    conversion=cantidad;
                }
                break;
            case "USD":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.86;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 20.34;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 3817.01;   
                }else{//USD
                    conversion=cantidad;
                }
                break;
            case "COP":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.00024;
                }else if (currencyOut.equals("USD")){
                    conversion = cantidad * 0.00027;
                }else if (currencyOut.equals("MXN")){
                    conversion = cantidad * 0.0056;
                }else{
                    conversion=cantidad;
                }
                break; 
            case "MXN":
                if(currencyOut.equals("EUR")){
                    conversion=cantidad*0.042;
                }else if (currencyOut.equals("USD")){
                    conversion = cantidad * 0.049;
                }else if (currencyOut.equals("COP")){
                    conversion = cantidad * 182.17; 
                }else{
                    conversion=cantidad;
                }
                break;                    
        }
        
        //return aMoneda(conversion, a);
        return conversion;
    }
}
