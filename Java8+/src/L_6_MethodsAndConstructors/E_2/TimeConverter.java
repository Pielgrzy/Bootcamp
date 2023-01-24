package L_6_MethodsAndConstructors.E_2;

public class TimeConverter {
    double hoursToMinutes(double value) {
        return value * 60;
    }

    double minutesToSeconds(double value) {
        return hoursToMinutes(value) * 60;
    }

    double secondsToMilliseconds(double value) {
        return minutesToSeconds(value) * 1000;
    }
}
