/*
a contrctor:is a method wich is invoked automatically whenever instance is called.

*/

class ConstJd{
    public ConstJd(){
        System.out.println("thi is a constractor that called authomatically");        
         

    }
    public ConstJd(int a, int b){
        int answer=a+b;
        System.out.println("and a constractor  used to do operation like sum and others "+answer);

    }
}

/*
method overloading:is a way of naming a method with the same name but with differrent argumebnts because it does different things
we can acces parents(super) class's elements with child's instance but never to access child's methods with parent class's instance.

*/

class overloadingJd{
    public int AddNumbers(int a, int b){
         int answer=a+b;
         System.out.println("\nAddition by first method bacause its two arguments, answer is :"+answer);
        return answer;
    }
     public int AddNumbers(int a, int b, int c){
         int answer=a+b+c;
         System.out.println("addition by second method because it is three arguments and answer is : "+answer);
        return answer;
    }

    
}


/*
Inheritance:is a way in which a class is derivered from another class which they share same properties; some keyword used
a keyword 'extend' is used to do an inherritance
a child class can access public and protected elements of a parent class not private ones,a class which deliver other is called a parent class
 derivered class is called a child class
 */

class InheritanceJd{
    public void InhertPublic(){
        System.out.println("this is a public method being accesed by an inherited class");
    }
    public void InhertProtected(){
        System.out.println("this is a protected method being accesed by an inherited class");
    
    }
     private void InhertPrivate(){
            System.out.println("this is an error, it is never going tobe accessed by a child classes because it is private");
        }
}

class ChildClass extends  InheritanceJd{

}

/*
method overridding: this is the ability of overtaking parent class methods over child class, it is implemented in inheritance.

it gives the ability to choose which method to run, either one from parent class or from child class depending on priority of what we want.
'super' keyword that used to override a superclasses' method.
we can never override a constractor because it two classes can't have the same name in the same program since a constractor must have tha same name as  class's.


*/

class OverriddingJd{
    public void show(){
        System.out.println("this method is going to be overridden over child one");
    }

}
class ChildClassToOverride extends OverriddingJd{
    
    public void show(){
        super.show();
        System.out.println("let's overrid this method");
    }
    public void showAgain(){
        System.out.println("this wont be invoked a overridden");
    }
}
class javawork1{
    public static void main(String[] args){
        //this will run a constractor autotically
        System.out.println("\n\nABOUT CONSTRACTORS");
        ConstJd ConstObj=new ConstJd();
        ConstJd ConstObj1=new ConstJd(2,5);


        // inherritance demonstrations 
        System.out.println("\n\n ABOUT INHERITANCE ");
        ChildClass inObj=new ChildClass();
        //now use child class to access parent methods(elements: variables,methods,arrays, stacks, lists etc...);
        inObj.InhertPublic();
        inObj.InhertProtected();
        //inObj.InhertPrivate(); //if you uncomment this it is never going to run. becouse it is a private 
                                //method to the class InheritanceJd and we're trying to access it with a child class object 

    //overloading demonstration 
    System.out.println("\n\nABOUT METHOD OVERLOADING ");

    overloadingDemo ovlobj=new overloadingJd();
    ovlobj.AddNumbers(2,5,10);
    ovlobj.AddNumbers(10,20);


    System.out.println(" \n\nABOUT METHOD OVERRIDDING ");

    //by this we can acces show method through
    OverriddingJd ovrObj1=new ChildClassToOverride();
    ovrObj1.show();
    //ovrObj1.showAgain();//this is an error (if un commented) becouse we are trying to access a method which we haven't overriden.


    
    }

}
