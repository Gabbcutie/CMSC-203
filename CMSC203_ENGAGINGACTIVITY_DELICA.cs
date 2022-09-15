public class ProgramStruct {
    struct Employee{
        public string firstName;
        public string lastName;
        public int age;
        public float CompletedTraining;
    }
    public static void Main(string[] args){

        Employee employee1;

        Console.WriteLine("What is your first name?");
        employee1.firstName = Console.ReadLine( );
        Console.WriteLine("What is your last name?");
        employee1.lastName = Console.ReadLine( );
        Console.WriteLine("What is your age?");
        employee1.age = int.Parse(Console.ReadLine( ));
        Console.WriteLine("Do you completed the training?");
        employee1.CompletedTraining = float.Parse(Console.ReadLine( ));
        Console.WriteLine("You entered");
        Console.WriteLine("firstName: "+employee1.firstName);
        Console.WriteLine("lastName: "+employee1.lastName);
        Console.WriteLine("age: "+employee1.age);
        Console.WriteLine("Completed Training: "+employee1.CompletedTraining);
        }
}