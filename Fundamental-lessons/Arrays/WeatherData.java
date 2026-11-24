public class WeatherData {
    public ArrayList<Double> temps;
    public void cleanData(double low, double high) { 
        for (int i = temps.size() - 1; i >= 0; i--) { 
            if (temps.get(i) < low || temps.get(i) > high) { 
                temps.remove(i); 
                i--;
            }
        }
    }
    public int longestHotStreak(double limit) { 
        int longest = 0; 
        int currentStreak = 0;  
        for (int i = 0; i < temps.size(); i++) { 
            if (temps.get(i) > limit) {
                currentStreak += 1;
            } else { 
                if (currentStreak > longest) { 
                    longest = currentStreak; 
                } 
                currentStreak = 0;
            }
        }
        return longest;
        return currentStreak;

    }
} 

