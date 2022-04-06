db.products.insert untuk nambah data
db.products.find untuk melihat data
db.products.find({'name':'iPhone'}) untuk melihat data dengan kriteria tertentu
db.products.deleteOne({'name':'iPhone'}) untuk menghapus data
db.products.updateOne({'name':'iPhone'},{'$set':{'price':'20000'}}) untuk mengubah data