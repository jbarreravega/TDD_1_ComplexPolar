package com.company;

public interface Complex
{
    /**
     * @return  retourne la partie reelle du nombre complexe this
     */
    double re();

    /**
     * @return  retourne la partie imaginaire du nombre complexe this
     */
    double im();

    /**
     * @return  retourne la phase du nombre complexe this
     */
    double theta();

    /**
     * @return  retourne le module du nombre complex this
     */
    double abs();

    /**
     * @param c c!=null
     * @return  retourne vrai si le nombre complexe c est egal numeriquement
     *          au nombre complex this. c et this ne sont pas modifies
     */
    boolean same(Complex c);
     
    /**
     * @return returns a representation of this in a String in the form "x [+-] i * y" where x is the real part, y the absolute value of the imaginary part.
     * if the imaginary part is negative, a '-' is outputted else it is a '+'.
     */
    String toString();

}