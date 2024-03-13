import Link from "next/link";
import Image from "next/image";
import Button from "./components/button";


export default function Home() {
  return (
    <>
    <nav>
      <ul>
        <li>
          <Link  href={'/'}>Home</Link>
        </li>
        <li>
          <Link href={'/page1'}>Page1</Link>
        </li>
        <li>
        <Link href={'/page2'}>Page2</Link>
        </li>
        <li>
        <Link href={'https://www.youtube.com/'}>Youtube</Link>
        </li>
        <li>
          <Button text = "Outro Botão" alt = "texto alternativo"></Button>
        </li>
      </ul>
    </nav>
    <main>
      <h1>Imagem</h1>
      <Image src="/image.jpeg" width={200} height={200} alt="Next.js logo" />
      <Button text = "Meu Botão" alt = "texto alternativo"></Button>
    </main>
    </>
    
  );
}
