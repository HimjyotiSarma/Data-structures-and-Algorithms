import java.util.*;

public class MaxPopulation {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            Map<Integer, Integer> populationLog = new HashMap<>();
            for(int[] log : logs){
                int birthYear = log[0];
                int deathYear = log[1];
                populationLog.put(birthYear, populationLog.getOrDefault(birthYear, 0)+1);
                populationLog.put(deathYear, populationLog.getOrDefault(deathYear, 0)-1);
            }
            int maxPopulation = 0;
            int currentPopulation = 0;
            int earliestYear = 1950;

            List<Integer> years = new ArrayList<>(populationLog.keySet());
            Collections.sort(years);

            for(int year : years){
                currentPopulation+=populationLog.get(year);
                if(currentPopulation > maxPopulation){
                    maxPopulation = currentPopulation;
                    earliestYear = year;
                }
            }

            return earliestYear;


        }
    }
}

