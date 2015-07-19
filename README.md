# MongoNotes


Type of ResultConverter would be Collection





I started with:
TableExpansion
	TableNode
	TypeMapping
		ProductNode
			TableExpansion	
				TableNode
				TypeMapping
					Path
					Path
			Path
			Path   // here should be an array
			TableExpansion   //this should be array of objects
				TableNode
				Typemapping 
					Path

		
				

I ended with sth like:

StructNode	
	(FieldSymbol, StructNode)
		FieldSymbol
		StructNode
			(FieldSymbol,Select)
			(FieldSymbol,Select)
	(FieldSymbol, Path)
		FieldSymbol
		Select
	(FieldSymbol, Pure(Select)
		FieldSymbol
		Pure
			Select(Path, SomeSymbol)
	(FieldSymbol, Pure(StructNode))
			FieldSymbol
			Pure
				StructNode
					(FieldSymbol, Select)

This would be a from part of ResultConverter




