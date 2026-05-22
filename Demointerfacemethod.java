interface Circle {
    // characteristics(public static final)
    float PI = 3.14f;

    // Behaviours (public)
    float area(float radius);

    float circumference(float radius);

}

class Marvellous implements Circle {
    // error due to missing body area of circumference
}

class Demointerfacemethod {
    public static void main(String A[]) {
        Marvellous mobj = new Marvellous();

    }
}