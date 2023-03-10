import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-08-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-08-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-02T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-02T01:30:26-03:00");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
		LocalDate d10 = LocalDate.of(2022,7,20);
		LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);
		/*
		System.out.println("D01 => " +d01);
		System.out.println("D02 => " +d02);
		System.out.println("D03 => " +d03);
		System.out.println("D04 => " +d04);
		System.out.println("D05 => " +d05);
		System.out.println("D06 => " +d06);
		System.out.println("D07 => " +d07);
		System.out.println("D08 => " +d08);
		System.out.println("D09 => " +d09);
		System.out.println("D10 => " +d10);
		System.out.println("D11 => " +d11);
		
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
				
		System.out.println(d04.format(fmt3));
		System.out.println(fmt3.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(fmt4.format(d06));
		
		
		//Converter uma data global para local		
		for(String s : ZoneId.getAvailableZoneIds())
			System.out.println(s);
		
		LocalDate dataConvertida = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate dataConvertida2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(dataConvertida);
		System.out.println(dataConvertida2);
		System.out.println(r3);
		
		System.out.println("Dia: " + d04.getDayOfMonth());
		System.out.println("Mes: " + d04.getMonthValue());
		System.out.println("Ano: " + d04.getYear());
		*/
		// Calculos com data e hora
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		Instant pastWeek2 = d06.minus(7,ChronoUnit.DAYS);
		Instant nextWeek2 = d06.plus(7,ChronoUnit.DAYS);
		
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		System.out.println(d05.minusDays(7));
		System.out.println(d05.plusDays(7));
		System.out.println(pastWeek2);
		System.out.println(nextWeek2);		
		
		//Dura??o
		Duration t01 = Duration.between(pastWeek.atTime(0,0),nextWeek.atTime(0,0)); //N?o suporta LocalDate
		Duration t02 = Duration.between(pastWeek.atStartOfDay(),nextWeek.atStartOfDay()); 
		Duration t03 = Duration.between(pastWeek2,nextWeek2); 
		System.out.println(t01.toDays());
		System.out.println(t02.toDays());
		System.out.println(t03.toDays());
	}

}

