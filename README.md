# NAVtasks
Tasks for NAV interview

OPPGAVE
I denne oppgaven skal du finne ut om en bruker kan få dagpenger, og hvor mye. Reglene er basert på de ekte dagpengereglene, men forenklet til å passe til oppgaven. Dagpenger er en ytelse man kan få hvis man har mistet jobben eller er permittert. For å være kvalifisert til å få dagpenger, må man ha hatt arbeidsinntekt minst det siste kalenderåret.
 
Når en bruker søker om dagpenger trenger de å vite om de har rett til dagpenger. Hvis de får det innvilget, trenger de også å vite hvor mye de får per dag, kalt dagsatsen. For å få innvilget dagpenger må man enten ha tjent til sammen over 3G de siste 3 kalenderårene, eller ha tjent over 1.5G forrige kalenderår. Grunnbeløpet, kalt G, brukes til å beregne mange av NAVs ytelser. Grunnbeløpet justeres 1. mai hvert år og blir fastsatt etter trygdeoppgjøret.
 
Hvis man har tjent nok til å få dagpenger, er det et nytt regnestykke for å finne grunnlaget vi trenger for å beregne dagsatsen. Dette dagpengegrunnlaget er også basert på inntekten de siste tre årene. Dagpengegrunnlaget er den høyeste verdien av enten inntekten siste kalenderåret, eller gjennomsnittsinntekten de siste tre kalenderårene. Dagpengegrunnlaget kan ikke være høyere enn 6G.
 
For å finne dagsatsen deler man dagpengegrunnlaget på antall arbeidsdager i året, rundet opp. I NAV har vi definert antall arbeidsdager i et år til å være 260.
 
Oppgaven er:
Ta imot tre år med inntekt, og returnere om bruker har rett på dagpenger. Inntekten er én sum per kalenderår.
Hvis brukeren har rett på dagpenger skal du også returnere dagsatsen.
Bruk enten Java, JavaScript eller Kotlin, det er ingen krav om UI.
Besvarelsen skal inneholde tester.
 
Eksempel: Hvis man har tjent dette:
2020: 500000
2019: 450000
2018: 400000
så ville man hatt rett på dagpenger, og man får en dagsats på kr 1924kr
