/*
 * TP2 ex2
 * 11/10/2024
 */
package tp2_convertisseurobjet_cavallo;

/**
 *
 * @author ethan
 */
public class Convertisseur {
    int nbConversions;

    public Convertisseur () {
        nbConversions = 0 ;
        }

    public double CelciusVersKelvin(double tCelcius) {
            nbConversions++ ;
            return tCelcius + 273.15;
        }

    public double KelvinVersCelcius(double tKelvin) {
            nbConversions++ ;
            return tKelvin - 273.15;
        }

    public  double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++ ;
        return (tFarenheit - 32) * 5 / 9;
        }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++ ;
            return (tCelcius * 9 / 5) + 32;
        }

    public double KelvinVersFarenheit(double tKelvin) {
            nbConversions++ ;
            double tempCelcius = KelvinVersCelcius(tKelvin);
            return CelciusVersFarenheit(tempCelcius);
        }

    public double FarenheitVersKelvin(double tFarenheit) {
            nbConversions++ ;
            double tempCelcius = FarenheitVersCelcius(tFarenheit);
            return CelciusVersKelvin(tempCelcius);
        }
    @Override
    public String toString () {
     return "nb de conversions"+ nbConversions;
    }
}
