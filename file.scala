1. I used Pure as a representation of collection
2. Not sure about it but probably get rid of TableNodes because it's
build a collection type even if it is nested.
3. First phase I will implementing will be ExpandDocument


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
				select    // here should be an array
				TableExpansion   //this should be array of objects
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
ResultConverter
	StructNode (I need a name for this structNode)	
		(FieldSymbol, StructNode)
			FieldSymbol (not sure if field symbol is the right choice)
			StructNode
				(ElementSymbol,Select)
				(elementSymbol,Select)
		(ElementSymbol, Select)
			ElementSymbol
			Select
		(ElementSymbol, Pure(Select))   (not sure if ElementSymbol is right choice for  primitive collection)
			ElementSymbol
			Pure
				Select
		(FieldSymbol, Pure(StructNode))
				FieldSymbol
				Pure
					StructNode
						(ElementSymbol, Select)
	Pure
		FieldSymbol
			StructNode
				(ElementSymbol,Select)
				(elementSymbol,Select)
		
	

That will be part of my operations.



