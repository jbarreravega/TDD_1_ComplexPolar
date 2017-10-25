package com.company;

public class ComplexPolar implements Complex
{
    private final double module;
    private final double phase;

    /**
     * Constructor
     * @param module    Module of a complex number
     * @param phase     Phase of a complex number
     */
    public ComplexPolar (double module, double phase)
    {
        this.module = module;
        this.phase = phase;
    }

    /**
     * @return retourne la partie reelle du nombre complexe this
     */
    public double re()
    {
        return this.module * Math.cos (this.phase) ;
    }

    /**
     * @return retourne la partie imaginaire du nombre complexe this
     */
    public double im()
    {
        return this.module * Math.sin (this.phase);
    }

    /**
     * @return retourne la phase du nombre complexe this
     */
    public double theta()
    {
        return phase ;
    }

    /**
     * @return retourne le module du nombre complex this
     */
    public double abs()
    {
        return module ;
    }

    /**
     * @param c c!=null
     * @return  retourne vrai si le nombre complexe c est egal numeriquement
     *          au nombre complex this. c et this ne sont pas modifies
     */
    public boolean same(Complex c) {
        return (this.abs() == c.abs() && this.theta() == c.theta());
    }
}