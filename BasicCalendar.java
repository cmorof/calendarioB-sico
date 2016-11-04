
/**
 * Write a description of class BasicCalendar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicCalendar
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    public BasicCalendar()
    {
        // initialise instance variables
        dia = 1;
        mes = 1;
        ano = 1;
    }

    public void avanzarFecha()
    {
        dia = dia + 1;
        if (dia > 30){
            mes = mes + 1;
            dia = 1;
        }
        if (mes > 12){
            ano = ano + 1;
            dia = 1;
            mes = 1;
        }
    }
    
    public void fijarFecha(int day,int month,int year)
    {
        dia = day;
        mes = month;
        ano = year;
    }
    
    public String obtenerFecha()
    {
        String day = " ";
        String month = " ";
        String year = " ";
        day = Integer.toString(dia);
        month = Integer.toString(mes);
        year = Integer.toString(ano);
        if (dia >=1 & dia <=9 & mes >=1 & mes <=9 & ano >=1 & ano <=9){
            return "0"+day +"-"+ "0"+month +"-"+ "0"+year;
        }
        else if (dia >=1 & dia <=9 & mes >=1 & mes <=9){
            return "0"+day +"-"+ "0"+month +"-"+ year;
        }
        else if (dia >=1 & dia <=9 & ano >=1 & ano <=9){
            return "0"+day +"-"+ month +"-"+ "0"+year;
        }
        else if (mes >=1 & mes <=9 & ano >=1 & ano <=9){
            return day +"-"+ "0"+month +"-"+ "0"+year;
        }
        else if (dia >=1 & dia <=9){
             return "0"+day +"-"+ month +"-"+ year;
        }
        else if (mes >=1 & mes <=9){
            return day +"-"+ "0"+month +"-"+ year;
        }
        else if (ano >=1 & ano <=9)
             return day +"-"+ month +"-"+ "0"+year;
        else{
            return day +"-"+ month +"-"+ year;
        }
    }
}
