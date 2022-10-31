// def call(String name, String dayofweek) {
//     sh "echo Hello ${name}. Today is ${dayofweek}."
// }

def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayofweek}."
}
