interface Circle {
    // characteristics(public static final)
    float PI = 3.14f;

    // Behaviours (public)
    float area(float radius);

    float circumference(float radius);

}

class Marvellous implements Circle {
    public float area(float radius) {
        return Circle.PI * radius * radius;
    }

    public float circumference(float radius) {
        return 2 * Circle.PI * radius;
    }
}

class DemointerfacemethodX {
    public static void main(String A[]) {
        // Circle cobj = new Circle(); not allowed
        Marvellous mobj = new Marvellous();
        float Ret = 0.0f;

        Ret = mobj.area(10.5f);
        System.out.println("Area is:" + Ret);

        Ret = mobj.circumference(10.5f);
        System.out.println("circumference is:" + Ret);

    }
}