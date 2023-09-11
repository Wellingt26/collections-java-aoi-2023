package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){
      this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
      Evento evento = new Evento(nome, atracao);
      eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
      System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
      LocalDate dataAtual = LocalDate.now();
      LocalDate proximaData = null;
      Evento proximoEvento = null;

      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

      for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
        if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
          proximaData = entry.getKey();
          proximoEvento = entry.getValue();
          System.out.println("O proximo evento: " + entry.getValue() + "acontecerá na data: " + entry.getKey());
          break;
        }
      }

    }

    public static void main(String[] args) {
      AgendaEvento agendaEvento = new AgendaEvento();

      agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "atração 1");
      agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JUNE, 9), "Evento 2", "atração 2");
      agendaEvento.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 9), "Evento 3", "atração 3");
       agendaEvento.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 9), "Evento 4", "atração 4");

      agendaEvento.exibirAgenda();
      
      agendaEvento.obterProximoEvento();
    }
}
