import React from 'react'

// const ProductCard = (params) => {
//   return (
//     <div>
//     <div>ProductCard</div>
//     <h2>Demo content</h2>
//     <h2>{params.title}</h2>
//     <p>Price: Rs:{params.price}</p>
//     </div>
//   )
// }
const ProductCard = ({title,price}) => {
  return (
    <div>
    <div>ProductCard</div>
    <h2>Demo content</h2>
    <h2>{title}</h2>
    <p>Price: Rs:{price}</p>
    </div>
  )
}

export default ProductCard