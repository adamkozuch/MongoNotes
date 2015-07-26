1. I used Pure as a representation of collection
2. Not sure about it but probably get rid of TableNodes because it's
build a collection type even if it is nested.
3. Distinguish Document and SubDocument.Maybe for document create separate DocumentNode and SubDocumentNode foo SubDocuments


I started with:
Bind
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
				Pure(Select)    //array of primitives
					Select
				Pure(TableExpansion)
					TableExpansion   
						TableNode
						Typemapping 
							Select
	Pure
		TableExpansion	
			TableNode
			TypeMapping
				Select
				Select
			

		
				

I ended with sth like:
Bind
	DocumentNode	
		StructNode (I need a name for this structNode)	
			(FieldSymbol, StructNode)
				FieldSymbol (not sure if field symbol is the right choice)
				StructNode
					(FieldSymbol,Select)
					(FieldSymbol,Select)
			(FieldSymbol, Select)
				FieldSymbol
				Select
			(FieldSymbol, Pure(Select))   
				FieldSymbol
				Pure
					Select
			(FieldSymbol, Pure(StructNode, TypeSymbol))
					FieldSymbol
					Pure
						TypeSumbol
						StructNode
							(FieldSymbol, Select)
	Pure
		StructNode
			(FieldSymbol,Select)
			(FieldSymbol,Select)
		
	



