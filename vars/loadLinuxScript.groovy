def call(Map Config = [:]) {
  def scriptContents = libraryResource "com/varshitha/testScripts/${config.name}"
  writeFile file : ${config.name}, text: scriptContents
  sh "chmod a+x ./${config.name}"
}
