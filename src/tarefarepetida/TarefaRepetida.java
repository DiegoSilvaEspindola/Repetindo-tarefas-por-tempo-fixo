package tarefarepetida;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TarefaRepetida {

    public static void main (String args []){

        Timer timer = new Timer();
        final long SEGUNDOS = (1000 * 5);

        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        timer.scheduleAtFixedRate( tarefa, 0, SEGUNDOS );

    }

}
