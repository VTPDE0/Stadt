public class Haus {
    int hausnummer;
    float hoehe;
    int anzahlFenster;
    int anzahlEtagen;
    String nachnameDerFamilier;

    Haus() {
        hausnummer = 1;
        hoehe = 5;
        anzahlFenster = 2;
        anzahlEtagen = 1;
    }

    int getHausnummer() {
        return hausnummer;
    }

    float getHoehe() {
        return hoehe;
    }

    void setHoehe(float neuHoehe) {
        if (neuHoehe >= 0.1) {
            hoehe = neuHoehe;
            System.out.println("Die Haushoehe ist " + hoehe);
        }
        else
        {
            hoehe=neuHoehe;
            System.err.println("Die Haushoehe ist falsch");
        }
    }
}

