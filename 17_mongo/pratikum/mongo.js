db.books.find({authorID:1,authorID:2})
db.books.find({authorID:1}, {
    _id: 1,
    title: 1 
});


db.books.aggregate([{$group: {_id:"authorID:2", sum_val:{$sum:"$stats.page"}}}])


db.collection.aggregate([
    { "$addFields": { "custom_field": "$obj.obj_field1" } }
])
db.books.aggregate( [
    { $project: { _id: 1 } },
    { $merge : { into : "authors" } }
 ] )

 db.books.aggregate( [
    {
      $lookup:
        {
          from: "authors",
          localField: "authorID",
          foreignField: "_id",
          as: "inventory_docs"
        }
   }
 ] )
 db.authors.aggregate( [
    {
      $lookup:
        {
          from: "books",
          localField: "_id",
          foreignField: "authorID",
          as: "inventory_docs"
        }
   },
    {
        $lookup: {
            from: "publishers",
            localField: "_id",
            foreignField: "publisheriD",
            as: "publisher"
        }
    }
 ] )
