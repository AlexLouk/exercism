import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        int[] dt = Arrays.stream(appointmentDateDescription.split("[ /:]+"))
                     .mapToInt(Integer::parseInt)
                     .toArray();
    
    return LocalDateTime.of(dt[2], dt[0], dt[1], dt[3], dt[4], dt[5]);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int currentHour = appointmentDate.getHour();
        return currentHour >= 12 && currentHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.ENGLISH);

        return "You have an appointment on " + appointmentDate.format(formatter);
    }



    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
