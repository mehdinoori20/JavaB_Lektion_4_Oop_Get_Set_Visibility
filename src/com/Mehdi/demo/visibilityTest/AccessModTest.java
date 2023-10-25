package com.Mehdi.demo.visibilityTest;

public class AccessModTest {

    // Variables
    public int agePublic =  15;
    protected  String name = "Benny";
    boolean isTiredNoModifie = true;
    private char gradePrivate = 'A';

    // Methods
    public void testPublic() {
        testPrivate(); // Is accessible from same class only
    }
    protected void testProtected() {}
    void testNoModifier() {}
    private void testPrivate () {}



}
