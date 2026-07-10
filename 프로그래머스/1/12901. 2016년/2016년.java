import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate localdate = LocalDate.of(2016, a, b);
        
        return switch (localdate.getDayOfWeek()) {
                case SUNDAY -> "SUN";
                case MONDAY -> "MON";
                case TUESDAY -> "TUE";
                case WEDNESDAY -> "WED";
                case THURSDAY -> "THU";
                case FRIDAY -> "FRI";
                case SATURDAY -> "SAT";
        };
    }
}