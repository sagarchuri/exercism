
object Acronym{

def abbreviate(phrase: String)={
	if(phrase == "" || phrase.trim =="") phrase
	else phrase.split(Array(' ','-')).map(x=> if(x.toUpperCase == x && x.endsWith(":"))  x else x.head).mkString.split(":")(0)
}

}