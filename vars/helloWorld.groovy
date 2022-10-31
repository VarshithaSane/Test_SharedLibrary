// def call(String name, String dayofweek) {
//     sh "echo Hello ${name}. Today is ${dayofweek}."
// }

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayofweek}."
}

// class Example {
//    static void main(String[] args) {
//       // Using a simple println statement to print output to the console
//       println('Hello World');
//    }
// }
