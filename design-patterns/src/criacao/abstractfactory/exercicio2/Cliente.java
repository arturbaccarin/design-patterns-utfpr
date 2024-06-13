package criacao.abstractfactory.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;

        try {
            date = dateFormat.parse("14/06/2024");
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        PizzariaFactory factory = null;

        switch (dayOfWeek) {
            case Calendar.MONDAY:
            case Calendar.WEDNESDAY:
            case Calendar.FRIDAY:
                factory = new PizzaioloCalabresaFactory();
                break;
            case Calendar.TUESDAY:
            case Calendar.THURSDAY:
            case Calendar.SATURDAY:
                factory = new PizzaioloPresuntoFactory();
                break;
            case Calendar.SUNDAY:
                System.out.println("A pizzaria está fechada aos domingos.");
                return;
        }

        if (factory != null) {
            Pizza pizza = factory.createPizza();
            Calzone calzone = factory.createCalzone();
            pizza.getIngredients();
            calzone.getIngredients();
        }
    }
}
