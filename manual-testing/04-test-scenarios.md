### Login

- Login de usuario con credenciales válidas (happy path)
- Login de usuario con credenciales inválidas (negative)
- Login con usuario bloqueado (regla de negocio)
- Login con campos vacíos
- Login sin contraseña

### Catálogo (listado de productos)
| Funcionalidades | Riesgo funcional
|----|----|
|Visualizar el listado de productos| Afecta al negocio porque si el usuario no puede visualizar productos, no puede realizar una compra| 
|Seleccionar y ver detalle de un producto| Si no existe un detalle de producto, genera desinterés por el cliente|
|Visualizar el agregado de un producto en el icono del carrito| - |
|Visualizar la disminución de un producto en el icono del carrito| - |
|Ordernar el listado de productos por su nombre de A a Z| - |
|Ordernar el listado de productos por su nombre de Z a A| - |
|Ordernar el listado de productos por su pecio de bajo a alto| - | 
|Ordernar el listado de productos por su pecio de alto a bajo| - |
|Agregar varios productos al carrito| - |

### Carrito de compras

- Continuar la verificación de compra de productos con el Checkout
- Visualizar el listado de productos agregados en el carrito
- Quitar un producto del carrito
- Visualizar el contenido vacío del carrito
- Volver al catálogo de productos

### Checkout

- Completar con datos válidos para la verificación (Checkout)
- Completar con compos vacíos para verificación (Checkout)
- Completar solo con campo nombre para el Checkout
- Completar solo con campo nombre y apellido para el Checkout
- Verificar el resumen general de compra antes de confirmar
- Cancelar la verificación de compra (Checkout) 


