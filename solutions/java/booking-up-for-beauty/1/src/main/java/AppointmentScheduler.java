import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//LocalDate ano mes y dia
//LocalDateTime ano mes dia y hora
//DateTimeFormatter dd/mm/anio
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //scheduler.schedule("7/25/2019 13:45:00");
        // => LocalDateTime.of(2019, 7, 25, 13, 45, 0)
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime fechafinal = LocalDateTime.parse(appointmentDateDescription, fecha);
        return fechafinal;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if(appointmentDate.isBefore(LocalDateTime.now())){
            return true;
        } else {
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int dia = appointmentDate.getHour();
        if(dia >= 12 && dia < 18){
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
    // "You have an appointment on Thursday, July 25, 2019, at 1:45 PM.";

        String formato = "'You have an appointment on 'EEEE, MMMM d, yyyy, 'at 'h:mm a.";

        DateTimeFormatter eu = DateTimeFormatter.ofPattern(formato, Locale.US);

        return appointmentDate.format(eu);


    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDateTime.now().getYear();

        LocalDate fecha = LocalDate.of(year, 9,15);

        return fecha;
    }
}
