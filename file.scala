1. I used Pure as a representation of collection
2. Not sure about it but probably get rid of TableNodes because it's
build a collection type even if it is nested.
3. First phase I will implementing will be ExpandDocument


I started with:
TableExpansion
	TableNode
	TypeMapping
		ProductNode
			TableExpansion	
				TableNode
				TypeMapping
					Select
					Select
			Select 
			select    // here should be an array
			TableExpansion   //this should be array of objects
				TableNode
				Typemapping 
					Select

		
				

I ended with sth like:

StructNode	
	(FieldSymbol, StructNode)
		FieldSymbol
		StructNode
			(FieldSymbol,Select)
			(FieldSymbol,Select)
	(FieldSymbol, Select)
		FieldSymbol
		Select
	(FieldSymbol, Pure(Select))
		FieldSymbol
		Pure
			Select(Path, SomeSymbol)
	(FieldSymbol, Pure(StructNode))
			FieldSymbol
			Pure
				StructNode
					(FieldSymbol, Select)





