import java.util.HashMap;

//Program for å beregne om en bruker har rett til dagpenger
class DagPenger{
    boolean correct = true; //Variable som håndterer om ting er satt inn korrekt
    int grunnbeløp = 106399; //Hentet beløpet fra nav.no
    int lastyear = 2020; //Har en variabel for det forrige året slik at man kan bruke programmet flere år på rad
    int totalSalary = 0; //Gjør denne global da den skal brukes i flere funksjoner
    public static void main(String[] args) {
        HashMap<Integer, Integer> salary = new HashMap<>();
        salary.put(2020, 500000);
        salary.put(2019, 450000);
        salary.put(2018, 400000);

        DagPenger dp = new DagPenger();
        dp.testNull();
        boolean eligible = dp.dayMoney(salary);
        if (eligible){
            int rate = dp.rate(salary);
            System.out.println("Du har rett på dagpenger og satsen din er " + rate);
        }else{
            //Hvis denne ikke er sann skal det ha blitt printet ut en feilmelding
            if (dp.correct){
                System.out.println("Du har dessverre ikke krav på dagpenger");
            }
        }
    }

    boolean dayMoney(HashMap<Integer, Integer> salary){
        //Sjekker for feil
        if (salary.get(lastyear) == null || salary.get(lastyear - 1) == null || salary.get(lastyear - 2) == null){
            System.out.println("Lønnen er ikke oppgitt korrekt, prøv igjen");
            correct = false;
            return false;
        }

        totalSalary += salary.get(lastyear);
        totalSalary += salary.get(lastyear - 1);
        totalSalary += salary.get(lastyear - 2);
        if (totalSalary > (3 * grunnbeløp)){
            return true;
        }else{
            if (salary.get(lastyear) > (grunnbeløp * 1.5)){
                return true;
            }
        } 
        return false;
    }

    int rate(HashMap<Integer, Integer> salary){
        int basis;
        if (totalSalary/3 >= salary.get(lastyear)){
            basis = totalSalary;
        }else{
            basis = salary.get(lastyear);
        }

        if (basis > (grunnbeløp * 6)){
            basis = grunnbeløp * 6;
        }

        //Runder opp et hvert tall
        return (int) Math.ceil(basis/260.00);
    }

    void testNull(){
        //Tester hva som skjer vi man legger inn feil i lønnen sin, både på år og verdi
        HashMap<Integer, Integer> salary = new HashMap<>();
        salary.put(null, 500000);
        salary.put(2019, null);
        salary.put(2018, 400000);
        DagPenger dp = new DagPenger();
        dp.dayMoney(salary);
    }
}