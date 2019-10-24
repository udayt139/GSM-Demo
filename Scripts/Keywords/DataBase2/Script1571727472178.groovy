'connect to database'
CustomKeywords.'com.database.mysql.connectDB'('127.0.0.1', '3306','testlink', 'root', '' )

'execute query'
def recordset=CustomerKeywords.'com.database.mysql.execute'("Select * From db")

while (recordset.next())
{
	'get name value of record'
	Object id = recordset.getObject("id")
	System.out.println(">>>name = " + id)
}
