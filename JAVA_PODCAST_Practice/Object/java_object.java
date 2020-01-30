class Employee{

    private int id;
    private String name;

    Employee(int id,String name){

        this.id=id;
        this.name=name;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public boolean equals(Object obj){

        return this.getName().equals(((Employee)obj).getName());
    }

    
}






class java_object{


    public void StringMatching(String s1,String s2){

        if (s1==s2) {
            System.out.println("matched string");
            
        } else {
            System.out.println("not matched strings");
            
        }



    }

    public void matchingNumber(int a,int b){
        if (a==b) {
            System.out.println("match numbers");
        } else {
            System.out.println("not match numbers");
            
        }
    }
    public static void main(String[] args) {
        /* 
            in this case string two different object is created
            since the name is different 
        */
        
        String s1="sandy";
        String s2="amit";
        System.out.println(s1.equals(s2));

        /*
            In this refernce variable wil be 2  there since
            but both of them points to the same variable 

        */
        

        
        String s3="sandy";
        String s4="sandy";
        System.out.println(s3.equals(s4));



        //Calling Stirng matching using ==

        java_object j1=new java_object();
        j1.StringMatching("amit", "amit");

        j1.matchingNumber(1, 1);

        System.out.println("hello world");


        Employee e1=new Employee(1, "amit");
        Employee e2=new Employee(1, "amit");

        if (e1.equals(e2)) {
            System.out.println("This match is from objects match");
            
        }
        else{
            System.out.println("not matched");
        }
    }
}